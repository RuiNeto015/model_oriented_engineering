/**
 */
package pt.isep.enorm.rjmn.cr3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Subject#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Subject#getUserFeedback <em>User Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Subject#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getSubject()
 * @model
 * @generated
 */
public interface Subject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getSubject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Subject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.rjmn.cr3.UserFeedback}.
	 * It is bidirectional and its opposite is '{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Feedback</em>' containment reference list.
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getSubject_UserFeedback()
	 * @see pt.isep.enorm.rjmn.cr3.UserFeedback#getSubject
	 * @model opposite="subject" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<UserFeedback> getUserFeedback();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.rjmn.cr3.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getSubject_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // Subject
