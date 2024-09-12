/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.Assign3GrammarAccess;
import pt.isep.enorm.atb.cr2.Feature;
import pt.isep.enorm.atb.cr2.Model;
import pt.isep.enorm.atb.cr2.Subject;
import pt.isep.enorm.atb.cr2.UserFeedback;

@SuppressWarnings("all")
public class Assign3Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private Assign3GrammarAccess _assign3GrammarAccess;

  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    document.<Subject>format(model.getSubject());
  }

  protected void _format(final Subject subject, @Extension final IFormattableDocument document) {
    EList<UserFeedback> _userFeedback = subject.getUserFeedback();
    for (final UserFeedback userFeedback : _userFeedback) {
      document.<UserFeedback>format(userFeedback);
    }
    EList<Feature> _feature = subject.getFeature();
    for (final Feature feature : _feature) {
      document.<Feature>format(feature);
    }
  }

  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof Subject) {
      _format((Subject)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}