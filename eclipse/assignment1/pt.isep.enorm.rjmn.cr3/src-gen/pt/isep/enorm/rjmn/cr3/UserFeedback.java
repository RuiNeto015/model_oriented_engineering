/**
 */
package pt.isep.enorm.rjmn.cr3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getUserFeedback()
 * @model abstract="true"
 * @generated
 */
public interface UserFeedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getUserFeedback_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pt.isep.enorm.rjmn.cr3.Subject#getUserFeedback <em>User Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' container reference.
	 * @see #setSubject(Subject)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getUserFeedback_Subject()
	 * @see pt.isep.enorm.rjmn.cr3.Subject#getUserFeedback
	 * @model opposite="userFeedback" transient="false"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getSubject <em>Subject</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' container reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

} // UserFeedback
