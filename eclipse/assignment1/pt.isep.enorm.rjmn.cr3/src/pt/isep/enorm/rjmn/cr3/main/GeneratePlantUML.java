package pt.isep.enorm.rjmn.cr3.main;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pt.isep.enorm.rjmn.cr3.Comment;
import pt.isep.enorm.rjmn.cr3.Cr3Factory;
import pt.isep.enorm.rjmn.cr3.Cr3Package;
import pt.isep.enorm.rjmn.cr3.Feature;
import pt.isep.enorm.rjmn.cr3.Model;
import pt.isep.enorm.rjmn.cr3.ModerationProcess;
import pt.isep.enorm.rjmn.cr3.Subject;
import pt.isep.enorm.rjmn.cr3.UserFeedback;


public class GeneratePlantUML {

	public static void main(String[] args) {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		Cr3Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Cr3Factory factory = Cr3Factory.eINSTANCE;

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createURI("instances/amazon3.xmi"), true);

		PrintWriter writer=null;
		try {
			// now load the content.
			resource.load(Collections.EMPTY_MAP);

			// Get the root element
			EObject root = resource.getContents().get(0);
			Model myModel=(Model)root;
			
			System.out.println(root.toString());
			
			//-----
			// Generate a plantuml file that represents the CR3 model in a UML diagram (other options/notations could be used)
			FileWriter w = new FileWriter("instances/amazon3.puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
			Subject mySubject=myModel.getSubject();
			writer.println("class "+mySubject.getName()+" << (S,#FF7700) >> {");
			writer.println("}");
			
			
			// For the User Feedback - Definition of User Feedback
	        for (UserFeedback uf: mySubject.getUserFeedback()) {
	        	writer.println("class "+uf.getName()+" << (F,green) >> {");
		        writer.println("}");	        	
	        }
	        
	        // For the User Feedback - Definition of User Feedback
	        for (Feature feat: mySubject.getFeature()) {
	        	writer.println("class "+feat.getName()+" << (F,red) >> {");
		        writer.println("}");	        	
	        }

			// For the User Feedback - Relationship with Subject 
	        for (UserFeedback uf: mySubject.getUserFeedback()) {
	        	writer.println(mySubject.getName()+" *-> "+uf.getName());
	        	
	        	if(uf instanceof Comment) {
	        		Comment newComment = (Comment) uf;
	    	        if(newComment.getModerationProcess() != null) {
	    	        	writer.println("class "+newComment.getModerationProcess().getName()+" << (F,blue) >> {");
	    		        writer.println("}");
	    	        	writer.println(newComment.getName()+" *-> "+newComment.getModerationProcess().getName());
	    	        }
	        	}
	        }
	        
	        // For the Feature - Relationship with Subject 
	        for (Feature feat: mySubject.getFeature()) {
	        	writer.println(mySubject.getName()+" *-> "+feat.getName());
	        }
			
			//resource.save(Collections.EMPTY_MAP);
	        writer.println("@enduml");		
	        writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
	}
}