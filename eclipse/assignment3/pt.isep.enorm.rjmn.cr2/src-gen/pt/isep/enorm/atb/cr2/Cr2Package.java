/**
 */
package pt.isep.enorm.atb.cr2;

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
 * @see pt.isep.enorm.atb.cr2.Cr2Factory
 * @model kind="package"
 * @generated
 */
public interface Cr2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cr2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cr2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cr2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cr2Package eINSTANCE = pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.ModelImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getModel()
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
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.SubjectImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getSubject()
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
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.FeatureImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getFeature()
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
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.UserFeedbackImpl <em>User Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.UserFeedbackImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getUserFeedback()
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
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.ReviewImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getReview()
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
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.CommentImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getComment()
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
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl <em>Moderation Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getModerationProcess()
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
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS__STEP = 1;

	/**
	 * The feature id for the '<em><b>Start Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS__START_STEP = 2;

	/**
	 * The number of structural features of the '<em>Moderation Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Moderation Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.StepImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getStep()
	 * @generated
	 */
	int STEP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.EndImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getEnd()
	 * @generated
	 */
	int END = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = STEP__NAME;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.ValidationStepImpl <em>Validation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.ValidationStepImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getValidationStep()
	 * @generated
	 */
	int VALIDATION_STEP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Approve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_STEP__NEXT_APPROVE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Reject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_STEP__NEXT_REJECT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Validation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Validation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.AutomaticImpl <em>Automatic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.AutomaticImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getAutomatic()
	 * @generated
	 */
	int AUTOMATIC = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC__NAME = VALIDATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Approve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC__NEXT_APPROVE = VALIDATION_STEP__NEXT_APPROVE;

	/**
	 * The feature id for the '<em><b>Next Reject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC__NEXT_REJECT = VALIDATION_STEP__NEXT_REJECT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC__METHOD = VALIDATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automatic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_FEATURE_COUNT = VALIDATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Automatic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_OPERATION_COUNT = VALIDATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.impl.ManualImpl
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NAME = VALIDATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Approve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NEXT_APPROVE = VALIDATION_STEP__NEXT_APPROVE;

	/**
	 * The feature id for the '<em><b>Next Reject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NEXT_REJECT = VALIDATION_STEP__NEXT_REJECT;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = VALIDATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = VALIDATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.GradeType <em>Grade Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.GradeType
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getGradeType()
	 * @generated
	 */
	int GRADE_TYPE = 12;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.ReviewType <em>Review Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.ReviewType
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getReviewType()
	 * @generated
	 */
	int REVIEW_TYPE = 13;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.atb.cr2.CommentType <em>Comment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.atb.cr2.CommentType
	 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pt.isep.enorm.atb.cr2.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.enorm.atb.cr2.Model#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see pt.isep.enorm.atb.cr2.Model#getSubject()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Subject();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.atb.cr2.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see pt.isep.enorm.atb.cr2.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Subject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.atb.cr2.Subject#getName()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.atb.cr2.Subject#getUserFeedback <em>User Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Feedback</em>'.
	 * @see pt.isep.enorm.atb.cr2.Subject#getUserFeedback()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_UserFeedback();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.atb.cr2.Subject#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see pt.isep.enorm.atb.cr2.Subject#getFeature()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Feature();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see pt.isep.enorm.atb.cr2.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.atb.cr2.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.UserFeedback <em>User Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Feedback</em>'.
	 * @see pt.isep.enorm.atb.cr2.UserFeedback
	 * @generated
	 */
	EClass getUserFeedback();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.UserFeedback#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.atb.cr2.UserFeedback#getName()
	 * @see #getUserFeedback()
	 * @generated
	 */
	EAttribute getUserFeedback_Name();

	/**
	 * Returns the meta object for the container reference '{@link pt.isep.enorm.atb.cr2.UserFeedback#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subject</em>'.
	 * @see pt.isep.enorm.atb.cr2.UserFeedback#getSubject()
	 * @see #getUserFeedback()
	 * @generated
	 */
	EReference getUserFeedback_Subject();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see pt.isep.enorm.atb.cr2.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Review#getGradeType <em>Grade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade Type</em>'.
	 * @see pt.isep.enorm.atb.cr2.Review#getGradeType()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_GradeType();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Review#getReviewType <em>Review Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Type</em>'.
	 * @see pt.isep.enorm.atb.cr2.Review#getReviewType()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_ReviewType();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see pt.isep.enorm.atb.cr2.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Comment#isReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reply</em>'.
	 * @see pt.isep.enorm.atb.cr2.Comment#isReply()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Reply();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Comment#isModeration <em>Moderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moderation</em>'.
	 * @see pt.isep.enorm.atb.cr2.Comment#isModeration()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Moderation();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Comment#getCommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Type</em>'.
	 * @see pt.isep.enorm.atb.cr2.Comment#getCommentType()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_CommentType();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.enorm.atb.cr2.Comment#getModerationProcess <em>Moderation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moderation Process</em>'.
	 * @see pt.isep.enorm.atb.cr2.Comment#getModerationProcess()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_ModerationProcess();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.ModerationProcess <em>Moderation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moderation Process</em>'.
	 * @see pt.isep.enorm.atb.cr2.ModerationProcess
	 * @generated
	 */
	EClass getModerationProcess();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.ModerationProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.atb.cr2.ModerationProcess#getName()
	 * @see #getModerationProcess()
	 * @generated
	 */
	EAttribute getModerationProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.atb.cr2.ModerationProcess#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see pt.isep.enorm.atb.cr2.ModerationProcess#getStep()
	 * @see #getModerationProcess()
	 * @generated
	 */
	EReference getModerationProcess_Step();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.atb.cr2.ModerationProcess#getStartStep <em>Start Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Step</em>'.
	 * @see pt.isep.enorm.atb.cr2.ModerationProcess#getStartStep()
	 * @see #getModerationProcess()
	 * @generated
	 */
	EReference getModerationProcess_StartStep();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see pt.isep.enorm.atb.cr2.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.atb.cr2.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see pt.isep.enorm.atb.cr2.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.ValidationStep <em>Validation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Step</em>'.
	 * @see pt.isep.enorm.atb.cr2.ValidationStep
	 * @generated
	 */
	EClass getValidationStep();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.atb.cr2.ValidationStep#getNextApprove <em>Next Approve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Approve</em>'.
	 * @see pt.isep.enorm.atb.cr2.ValidationStep#getNextApprove()
	 * @see #getValidationStep()
	 * @generated
	 */
	EReference getValidationStep_NextApprove();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.atb.cr2.ValidationStep#getNextReject <em>Next Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Reject</em>'.
	 * @see pt.isep.enorm.atb.cr2.ValidationStep#getNextReject()
	 * @see #getValidationStep()
	 * @generated
	 */
	EReference getValidationStep_NextReject();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Automatic <em>Automatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic</em>'.
	 * @see pt.isep.enorm.atb.cr2.Automatic
	 * @generated
	 */
	EClass getAutomatic();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.atb.cr2.Automatic#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see pt.isep.enorm.atb.cr2.Automatic#getMethod()
	 * @see #getAutomatic()
	 * @generated
	 */
	EAttribute getAutomatic_Method();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.atb.cr2.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see pt.isep.enorm.atb.cr2.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.atb.cr2.GradeType <em>Grade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grade Type</em>'.
	 * @see pt.isep.enorm.atb.cr2.GradeType
	 * @generated
	 */
	EEnum getGradeType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.atb.cr2.ReviewType <em>Review Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Review Type</em>'.
	 * @see pt.isep.enorm.atb.cr2.ReviewType
	 * @generated
	 */
	EEnum getReviewType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.atb.cr2.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comment Type</em>'.
	 * @see pt.isep.enorm.atb.cr2.CommentType
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
	Cr2Factory getCr2Factory();

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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.ModelImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getModel()
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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.SubjectImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getSubject()
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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.FeatureImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getFeature()
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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.UserFeedbackImpl <em>User Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.UserFeedbackImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getUserFeedback()
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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.ReviewImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getReview()
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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.CommentImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getComment()
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
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl <em>Moderation Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getModerationProcess()
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
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_PROCESS__STEP = eINSTANCE.getModerationProcess_Step();

		/**
		 * The meta object literal for the '<em><b>Start Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_PROCESS__START_STEP = eINSTANCE.getModerationProcess_StartStep();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.StepImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.EndImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.ValidationStepImpl <em>Validation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.ValidationStepImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getValidationStep()
		 * @generated
		 */
		EClass VALIDATION_STEP = eINSTANCE.getValidationStep();

		/**
		 * The meta object literal for the '<em><b>Next Approve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_STEP__NEXT_APPROVE = eINSTANCE.getValidationStep_NextApprove();

		/**
		 * The meta object literal for the '<em><b>Next Reject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_STEP__NEXT_REJECT = eINSTANCE.getValidationStep_NextReject();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.AutomaticImpl <em>Automatic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.AutomaticImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getAutomatic()
		 * @generated
		 */
		EClass AUTOMATIC = eINSTANCE.getAutomatic();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC__METHOD = eINSTANCE.getAutomatic_Method();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.impl.ManualImpl
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.GradeType <em>Grade Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.GradeType
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getGradeType()
		 * @generated
		 */
		EEnum GRADE_TYPE = eINSTANCE.getGradeType();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.ReviewType <em>Review Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.ReviewType
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getReviewType()
		 * @generated
		 */
		EEnum REVIEW_TYPE = eINSTANCE.getReviewType();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.atb.cr2.CommentType <em>Comment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.atb.cr2.CommentType
		 * @see pt.isep.enorm.atb.cr2.impl.Cr2PackageImpl#getCommentType()
		 * @generated
		 */
		EEnum COMMENT_TYPE = eINSTANCE.getCommentType();

	}

} //Cr2Package
