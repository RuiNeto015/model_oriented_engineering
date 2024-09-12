/**
 */
package pt.isep.enorm.rjmn.cr3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Comment#isReply <em>Reply</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Comment#isModeration <em>Moderation</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Comment#getCommentType <em>Comment Type</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Comment#getModerationProcess <em>Moderation Process</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getComment()
 * @model
 * @generated
 */
public interface Comment extends UserFeedback {
	/**
	 * Returns the value of the '<em><b>Reply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply</em>' attribute.
	 * @see #setReply(boolean)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getComment_Reply()
	 * @model required="true"
	 * @generated
	 */
	boolean isReply();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Comment#isReply <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply</em>' attribute.
	 * @see #isReply()
	 * @generated
	 */
	void setReply(boolean value);

	/**
	 * Returns the value of the '<em><b>Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderation</em>' attribute.
	 * @see #setModeration(boolean)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getComment_Moderation()
	 * @model required="true"
	 * @generated
	 */
	boolean isModeration();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Comment#isModeration <em>Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderation</em>' attribute.
	 * @see #isModeration()
	 * @generated
	 */
	void setModeration(boolean value);

	/**
	 * Returns the value of the '<em><b>Comment Type</b></em>' attribute.
	 * The default value is <code>"SIMPLE"</code>.
	 * The literals are from the enumeration {@link pt.isep.enorm.rjmn.cr3.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Type</em>' attribute.
	 * @see pt.isep.enorm.rjmn.cr3.CommentType
	 * @see #setCommentType(CommentType)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getComment_CommentType()
	 * @model default="SIMPLE"
	 * @generated
	 */
	CommentType getCommentType();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Comment#getCommentType <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Type</em>' attribute.
	 * @see pt.isep.enorm.rjmn.cr3.CommentType
	 * @see #getCommentType()
	 * @generated
	 */
	void setCommentType(CommentType value);

	/**
	 * Returns the value of the '<em><b>Moderation Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderation Process</em>' containment reference.
	 * @see #setModerationProcess(ModerationProcess)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getComment_ModerationProcess()
	 * @model containment="true"
	 * @generated
	 */
	ModerationProcess getModerationProcess();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Comment#getModerationProcess <em>Moderation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderation Process</em>' containment reference.
	 * @see #getModerationProcess()
	 * @generated
	 */
	void setModerationProcess(ModerationProcess value);

} // Comment
