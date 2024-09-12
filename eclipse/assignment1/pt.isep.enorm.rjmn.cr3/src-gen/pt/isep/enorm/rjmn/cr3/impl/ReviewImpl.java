/**
 */
package pt.isep.enorm.rjmn.cr3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.isep.enorm.rjmn.cr3.Cr3Package;
import pt.isep.enorm.rjmn.cr3.GradeType;
import pt.isep.enorm.rjmn.cr3.Review;
import pt.isep.enorm.rjmn.cr3.ReviewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.impl.ReviewImpl#getGradeType <em>Grade Type</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.impl.ReviewImpl#getReviewType <em>Review Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewImpl extends UserFeedbackImpl implements Review {
	/**
	 * The default value of the '{@link #getGradeType() <em>Grade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeType()
	 * @generated
	 * @ordered
	 */
	protected static final GradeType GRADE_TYPE_EDEFAULT = GradeType.CUSTOM;

	/**
	 * The cached value of the '{@link #getGradeType() <em>Grade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeType()
	 * @generated
	 * @ordered
	 */
	protected GradeType gradeType = GRADE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewType() <em>Review Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewType()
	 * @generated
	 * @ordered
	 */
	protected static final ReviewType REVIEW_TYPE_EDEFAULT = ReviewType.ONLYGRADE;

	/**
	 * The cached value of the '{@link #getReviewType() <em>Review Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewType()
	 * @generated
	 * @ordered
	 */
	protected ReviewType reviewType = REVIEW_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr3Package.Literals.REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GradeType getGradeType() {
		return gradeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradeType(GradeType newGradeType) {
		GradeType oldGradeType = gradeType;
		gradeType = newGradeType == null ? GRADE_TYPE_EDEFAULT : newGradeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr3Package.REVIEW__GRADE_TYPE, oldGradeType,
					gradeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewType getReviewType() {
		return reviewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewType(ReviewType newReviewType) {
		ReviewType oldReviewType = reviewType;
		reviewType = newReviewType == null ? REVIEW_TYPE_EDEFAULT : newReviewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr3Package.REVIEW__REVIEW_TYPE, oldReviewType,
					reviewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Cr3Package.REVIEW__GRADE_TYPE:
			return getGradeType();
		case Cr3Package.REVIEW__REVIEW_TYPE:
			return getReviewType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Cr3Package.REVIEW__GRADE_TYPE:
			setGradeType((GradeType) newValue);
			return;
		case Cr3Package.REVIEW__REVIEW_TYPE:
			setReviewType((ReviewType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Cr3Package.REVIEW__GRADE_TYPE:
			setGradeType(GRADE_TYPE_EDEFAULT);
			return;
		case Cr3Package.REVIEW__REVIEW_TYPE:
			setReviewType(REVIEW_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Cr3Package.REVIEW__GRADE_TYPE:
			return gradeType != GRADE_TYPE_EDEFAULT;
		case Cr3Package.REVIEW__REVIEW_TYPE:
			return reviewType != REVIEW_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (gradeType: ");
		result.append(gradeType);
		result.append(", reviewType: ");
		result.append(reviewType);
		result.append(')');
		return result.toString();
	}

} //ReviewImpl
