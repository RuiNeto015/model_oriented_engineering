package pt.isep.enorm.atb.cr2.main;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import pt.isep.enorm.atb.cr2.Cr2Package;

public class Refactor {

	public static void initOCL() {
		//-----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		
		OCLDelegateDomain.initialize(null);
		
		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install(); 
		//-------------		
	}	
	
	public static void registerEcorePackages() {
		// Associate the "xmi" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the cr2 package
		Cr2Package.eINSTANCE.eClass();

		// Initialize the EMFTVM package
		org.eclipse.m2m.atl.emftvm.EmftvmPackage.eINSTANCE.eClass();

		// Associate the "emftvm" extension with the EMFTVM resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
	}

	public static void main(String[] args) {

		//refactoringTransformation("featurename2uppercase", "http://www.example.org/cr2", "instances/amazon3.xmi", "instances/amazon3-output1.xmi");

		refactoringTransformation("addendstep", "http://www.example.org/cr2", "instances/mypublico.xmi", "instances/mypublico-output.xmi");


	}

	public static void refactoringTransformation(String module, String metaModel, String modelIn, String modelOut) {
		
		// Initialize OCL support
		initOCL();
		
		registerEcorePackages();

		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		// Load metamodels
		Metamodel metaM = EmftvmFactory.eINSTANCE.createMetamodel();
		metaM.setResource(rs.getResource(URI.createURI(metaModel), true));
		env.registerMetaModel("CR2", metaM);

		// Load models
		Model inOutModel = EmftvmFactory.eINSTANCE.createModel();
		inOutModel.setResource(rs.getResource(URI.createURI(modelIn, true), true));
		env.registerInOutModel("IN", inOutModel);

		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver("transformations/", new ResourceSetImpl());

		TimingData td = new TimingData();
		env.loadModule(mr, module);
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		try {
			inOutModel.getResource().setURI(URI.createFileURI(modelOut));
			inOutModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}