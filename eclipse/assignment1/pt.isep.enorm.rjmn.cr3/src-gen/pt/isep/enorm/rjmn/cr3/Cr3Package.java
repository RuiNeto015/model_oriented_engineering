/**
 */
package pt.isep.enorm.rjmn.cr3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.rjmn.cr3.Cr3Factory
 * @model kind="package"
 * @generated
 */
public interface Cr3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cr3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cr3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cr3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cr3Package eINSTANCE = pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.ModelImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.SubjectImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__USER_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.FeatureImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.UserFeedbackImpl <em>User Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.UserFeedbackImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getUserFeedback()
	 * @generated
	 */
	int USER_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK__SUBJECT = 1;

	/**
	 * The number of structural features of the '<em>User Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.ReviewImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__NAME = USER_FEEDBACK__NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__SUBJECT = USER_FEEDBACK__SUBJECT;

	/**
	 * The feature id for the '<em><b>Grade Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__GRADE_TYPE = USER_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Review Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEW_TYPE = USER_FEEDBACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = USER_FEEDBACK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = USER_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.CommentImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = USER_FEEDBACK__NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = USER_FEEDBACK__SUBJECT;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REPLY = USER_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MODERATION = USER_FEEDBACK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT_TYPE = USER_FEEDBACK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Moderation Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MODERATION_PROCESS = USER_FEEDBACK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = USER_FEEDBACK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = USER_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.impl.ModerationProcessImpl <em>Moderation Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.impl.ModerationProcessImpl
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getModerationProcess()
	 * @generated
	 */
	int MODERATION_PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Moderation Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Moderation Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.GradeType <em>Grade Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.GradeType
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getGradeType()
	 * @generated
	 */
	int GRADE_TYPE = 7;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.ReviewType <em>Review Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.ReviewType
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getReviewType()
	 * @generated
	 */
	int REVIEW_TYPE = 8;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.rjmn.cr3.CommentType <em>Comment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.rjmn.cr3.CommentType
	 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.enorm.rjmn.cr3.Model#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Model#getSubject()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Subject();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Subject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Subject#getName()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.rjmn.cr3.Subject#getUserFeedback <em>User Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Feedback</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Subject#getUserFeedback()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_UserFeedback();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.rjmn.cr3.Subject#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Subject#getFeature()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Feature();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.UserFeedback <em>User Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Feedback</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.UserFeedback
	 * @generated
	 */
	EClass getUserFeedback();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.UserFeedback#getName()
	 * @see #getUserFeedback()
	 * @generated
	 */
	EAttribute getUserFeedback_Name();

	/**
	 * Returns the meta object for the container reference '{@link pt.isep.enorm.rjmn.cr3.UserFeedback#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subject</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.UserFeedback#getSubject()
	 * @see #getUserFeedback()
	 * @generated
	 */
	EReference getUserFeedback_Subject();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Review#getGradeType <em>Grade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade Type</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Review#getGradeType()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_GradeType();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Review#getReviewType <em>Review Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Type</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Review#getReviewType()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_ReviewType();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Comment#isReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reply</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Comment#isReply()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Reply();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Comment#isModeration <em>Moderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moderation</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Comment#isModeration()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Moderation();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.Comment#getCommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Type</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Comment#getCommentType()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_CommentType();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.enorm.rjmn.cr3.Comment#getModerationProcess <em>Moderation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moderation Process</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.Comment#getModerationProcess()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_ModerationProcess();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.rjmn.cr3.ModerationProcess <em>Moderation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moderation Process</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.ModerationProcess
	 * @generated
	 */
	EClass getModerationProcess();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.rjmn.cr3.ModerationProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.ModerationProcess#getName()
	 * @see #getModerationProcess()
	 * @generated
	 */
	EAttribute getModerationProcess_Name();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.rjmn.cr3.GradeType <em>Grade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grade Type</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.GradeType
	 * @generated
	 */
	EEnum getGradeType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.rjmn.cr3.ReviewType <em>Review Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Review Type</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.ReviewType
	 * @generated
	 */
	EEnum getReviewType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.rjmn.cr3.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comment Type</em>'.
	 * @see pt.isep.enorm.rjmn.cr3.CommentType
	 * @generated
	 */
	EEnum getCommentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cr3Factory getCr3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.ModelImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SUBJECT = eINSTANCE.getModel_Subject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.SubjectImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__NAME = eINSTANCE.getSubject_Name();

		/**
		 * The meta object literal for the '<em><b>User Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__USER_FEEDBACK = eINSTANCE.getSubject_UserFeedback();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__FEATURE = eINSTANCE.getSubject_Feature();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.FeatureImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.UserFeedbackImpl <em>User Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.UserFeedbackImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getUserFeedback()
		 * @generated
		 */
		EClass USER_FEEDBACK = eINSTANCE.getUserFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_FEEDBACK__NAME = eINSTANCE.getUserFeedback_Name();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_FEEDBACK__SUBJECT = eINSTANCE.getUserFeedback_Subject();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.ReviewImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Grade Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__GRADE_TYPE = eINSTANCE.getReview_GradeType();

		/**
		 * The meta object literal for the '<em><b>Review Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__REVIEW_TYPE = eINSTANCE.getReview_ReviewType();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.CommentImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__REPLY = eINSTANCE.getComment_Reply();

		/**
		 * The meta object literal for the '<em><b>Moderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__MODERATION = eINSTANCE.getComment_Moderation();

		/**
		 * The meta object literal for the '<em><b>Comment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT_TYPE = eINSTANCE.getComment_CommentType();

		/**
		 * The meta object literal for the '<em><b>Moderation Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__MODERATION_PROCESS = eINSTANCE.getComment_ModerationProcess();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.impl.ModerationProcessImpl <em>Moderation Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.impl.ModerationProcessImpl
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getModerationProcess()
		 * @generated
		 */
		EClass MODERATION_PROCESS = eINSTANCE.getModerationProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_PROCESS__NAME = eINSTANCE.getModerationProcess_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.GradeType <em>Grade Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.GradeType
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getGradeType()
		 * @generated
		 */
		EEnum GRADE_TYPE = eINSTANCE.getGradeType();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.ReviewType <em>Review Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.ReviewType
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getReviewType()
		 * @generated
		 */
		EEnum REVIEW_TYPE = eINSTANCE.getReviewType();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.rjmn.cr3.CommentType <em>Comment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.rjmn.cr3.CommentType
		 * @see pt.isep.enorm.rjmn.cr3.impl.Cr3PackageImpl#getCommentType()
		 * @generated
		 */
		EEnum COMMENT_TYPE = eINSTANCE.getCommentType();

	}

} //Cr3Package
