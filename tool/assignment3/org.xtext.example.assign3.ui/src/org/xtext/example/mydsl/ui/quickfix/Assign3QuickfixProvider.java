/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.mydsl.validation.Assign3Validator;

import pt.isep.enorm.atb.cr2.Model;

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class Assign3QuickfixProvider extends DefaultQuickfixProvider {

	@Fix(Assign3Validator.MODEL_NAME_CAPITAL)
	public void fixModelNameNotStartWithCapital(final Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Change the model name to start with capital", "", "icon.png", new ISemanticModification() {
	        @Override
	        public void apply(EObject element, IModificationContext context) throws Exception {
	            if (element instanceof Model) {
	                Model model = (Model) element;
	                char firstLetter = Character.toUpperCase(model.getName().charAt(0));
	                String newName = firstLetter + model.getName().substring(1);
	                model.setName(newName);
	            }
	        }   
	    });
	}
}