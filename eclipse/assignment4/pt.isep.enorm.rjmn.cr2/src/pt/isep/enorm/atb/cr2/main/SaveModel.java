package pt.isep.enorm.atb.cr2.main;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import pt.isep.enorm.atb.cr2.Cr2Factory;
import pt.isep.enorm.atb.cr2.Cr2Package;
import pt.isep.enorm.atb.cr2.Feature;
import pt.isep.enorm.atb.cr2.Model;
import pt.isep.enorm.atb.cr2.Subject;
import pt.isep.enorm.atb.cr2.UserFeedback;

public class SaveModel {

	public static void initOCL() {
		// -----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI, new OCLValidationDelegateFactory.Global());

		OCLDelegateDomain.initialize(null);

		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		// -------------
	}

	// Example of how to use the EMF library
	public static void main(String[] args) {
		saveModel();
	}

	public static void saveModel() {

		// Initialize OCL support
		initOCL();

		// Associate the "xmi" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		Cr2Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Cr2Factory factory = Cr2Factory.eINSTANCE;

		// Create a model
		Model myModel = factory.createModel();
		myModel.setName("Amazon2");

		// Create a Subject
		Subject mySubject = factory.createSubject();
		mySubject.setName("Product");

		// Set Subject to the Model
		myModel.setSubject(mySubject);

		// Create a Feature
		Feature myFeature = factory.createFeature();
		myFeature.setName("Price");

		// Add Feature to the Subject
		mySubject.getFeature().add(myFeature);

		// Set Subject to the Model
		myModel.setSubject(mySubject);

		// Create a Feedback
		UserFeedback myUserFeedback = factory.createReview();
		myUserFeedback.setName("Review");

		// Add The Feedback to the Subject
		mySubject.getUserFeedback().add(myUserFeedback);

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource inside the resource set
		Resource resource = resSet.createResource(URI.createURI("instances/amazon3.xmi"));

		resource.getContents().add(myModel);

		// Dynamically get the root elements
		System.out.println("Root elements:");
		EList<EObject> objects = resource.getContents();
		for (EObject o : objects) {
			System.out.println("Object of EClass: " + o.eClass().getName());
		}

		// Add a call to validation...
		// See:
		// https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
		System.out.println("Diagnostic:");
		Diagnostic diag = Diagnostician.INSTANCE.validate(myModel);
		if (diag.getSeverity() != Diagnostic.OK) {
			System.out.println(diag.getMessage());
			List<Diagnostic> l = diag.getChildren();
			for (Diagnostic d : l) {
				System.out.println(d.getMessage());
			}
		} else {
			System.out.println(" Everything seems fine :-)");
		}

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
