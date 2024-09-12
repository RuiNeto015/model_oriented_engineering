/**
 */
package pt.isep.enorm.atb.cr2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.atb.cr2.ValidationStep#getNextApprove <em>Next Approve</em>}</li>
 *   <li>{@link pt.isep.enorm.atb.cr2.ValidationStep#getNextReject <em>Next Reject</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.atb.cr2.Cr2Package#getValidationStep()
 * @model abstract="true"
 * @generated
 */
public interface ValidationStep extends Step {
	/**
	 * Returns the value of the '<em><b>Next Approve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Approve</em>' reference.
	 * @see #setNextApprove(Step)
	 * @see pt.isep.enorm.atb.cr2.Cr2Package#getValidationStep_NextApprove()
	 * @model required="true"
	 * @generated
	 */
	Step getNextApprove();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.atb.cr2.ValidationStep#getNextApprove <em>Next Approve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Approve</em>' reference.
	 * @see #getNextApprove()
	 * @generated
	 */
	void setNextApprove(Step value);

	/**
	 * Returns the value of the '<em><b>Next Reject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Reject</em>' reference.
	 * @see #setNextReject(Step)
	 * @see pt.isep.enorm.atb.cr2.Cr2Package#getValidationStep_NextReject()
	 * @model required="true"
	 * @generated
	 */
	Step getNextReject();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.atb.cr2.ValidationStep#getNextReject <em>Next Reject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Reject</em>' reference.
	 * @see #getNextReject()
	 * @generated
	 */
	void setNextReject(Step value);

} // ValidationStep
