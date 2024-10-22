/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import pt.isep.enorm.atb.cr2.Subject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Assign5Generator extends AbstractGenerator {

  	@Inject extension IQualifiedNameProvider
  
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (s : resource.allContents.toIterable.filter(Subject)) {
	        fsa.generateFile(
            	s.fullyQualifiedName.toString("/") + ".java",
            	s.compile)
    	}	
    }
    
    private def compile(Subject s) '''
	package «s.eContainer.fullyQualifiedName»;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class «s.name» {
	
	«FOR f : s.feature»
	«"	"»private String «f.name»;
	«ENDFOR»
		private List<Comment> comments;
	
		«FOR f : s.feature»
		/**
		 * Gets the value of «f.name»
		 */
		public String get«f.name.toFirstUpper»() {
			return «f.name»;
		}
		
		/**
		 * Sets the value of «f.name»
		 */
		public void set«f.name.toFirstUpper»(String «f.name») {
			this.«f.name» = «f.name»;
		}
		
		«ENDFOR»
		/**
		 * Gets the value of Comments
		 */
		public List<Comment> getComments() {
			return comments;
		}
		
		/**
		 * Sets the value of Comments
		 */
		public void setComments(List<Comment> comments) {
			this.comments = comments;
		}
			
		public String toString() {
			return «s.feature.map[feature |
				'"' + feature.name + ': " + ' + feature.name
			].join(' + " " + ')»;
		}
	}
	'''
}