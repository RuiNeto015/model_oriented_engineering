package pt.isep.enorm.rjmn.cr3.main;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pt.isep.enorm.rjmn.cr3.Cr3Factory;
import pt.isep.enorm.rjmn.cr3.Cr3Package;
import pt.isep.enorm.rjmn.cr3.Feature;
import pt.isep.enorm.rjmn.cr3.Model;
import pt.isep.enorm.rjmn.cr3.Subject;
import pt.isep.enorm.rjmn.cr3.UserFeedback;

public class SaveModel {

	// Example of how to use the EMF library
	public static void main(String[] args) {
      saveModel();
	}
	
	public static void saveModel() {
		
		// Associate the "xmi" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		// Initialize the model
		Cr3Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
        Cr3Factory factory = Cr3Factory.eINSTANCE;
        
        // Create a model
        Model myModel = factory.createModel();
        myModel.setName("Amazon");

        // Create a Subject
        Subject mySubject = factory.createSubject();
        mySubject.setName("Product");
        
        // Set Subject to the Model
        myModel.setSubject(mySubject);

        // Create a Feature
        Feature myFeature = factory.createFeature();
        myFeature.setName("price");

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
        Resource resource = resSet.createResource(URI.createURI("instances/amazon4.xmi"));

        resource.getContents().add(myModel);
        
        // Dynamically get the root elements
        System.out.println("Root elements:");
        EList<EObject> objects=resource.getContents();
        for (EObject o: objects) {
        	System.out.println("Object of EClass: "+o.eClass().getName());
        }
        
        // Add a call to validation...
        // See: https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
        System.out.println("Diagnostic:");
        Diagnostic diag=Diagnostician.INSTANCE.validate(myModel);
        if (diag.getSeverity()!=Diagnostic.OK) {
        	System.out.println(diag.getMessage());
        	List<Diagnostic> l=diag.getChildren();
        	for (Diagnostic d: l) {
        		System.out.println(d.getMessage());
        	}
        }
        else {
        	System.out.println("Everything seems fine :-)");
        }
        
        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        } 		
	}
}

