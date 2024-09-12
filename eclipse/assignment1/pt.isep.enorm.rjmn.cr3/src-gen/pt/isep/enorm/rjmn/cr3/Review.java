/**
 */
package pt.isep.enorm.rjmn.cr3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Review#getGradeType <em>Grade Type</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.Review#getReviewType <em>Review Type</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getReview()
 * @model
 * @generated
 */
public interface Review extends UserFeedback {
	/**
	 * Returns the value of the '<em><b>Grade Type</b></em>' attribute.
	 * The default value is <code>"CUSTOM"</code>.
	 * The literals are from the enumeration {@link pt.isep.enorm.rjmn.cr3.GradeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Type</em>' attribute.
	 * @see pt.isep.enorm.rjmn.cr3.GradeType
	 * @see #setGradeType(GradeType)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getReview_GradeType()
	 * @model default="CUSTOM"
	 * @generated
	 */
	GradeType getGradeType();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Review#getGradeType <em>Grade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Type</em>' attribute.
	 * @see pt.isep.enorm.rjmn.cr3.GradeType
	 * @see #getGradeType()
	 * @generated
	 */
	void setGradeType(GradeType value);

	/**
	 * Returns the value of the '<em><b>Review Type</b></em>' attribute.
	 * The default value is <code>"ONLYGRADE"</code>.
	 * The literals are from the enumeration {@link pt.isep.enorm.rjmn.cr3.ReviewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Type</em>' attribute.
	 * @see pt.isep.enorm.rjmn.cr3.ReviewType
	 * @see #setReviewType(ReviewType)
	 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getReview_ReviewType()
	 * @model default="ONLYGRADE"
	 * @generated
	 */
	ReviewType getReviewType();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.rjmn.cr3.Review#getReviewType <em>Review Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Type</em>' attribute.
	 * @see pt.isep.enorm.rjmn.cr3.ReviewType
	 * @see #getReviewType()
	 * @generated
	 */
	void setReviewType(ReviewType value);

} // Review
