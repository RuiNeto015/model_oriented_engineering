/**
 */
package pt.isep.enorm.rjmn.cr3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.isep.enorm.rjmn.cr3.Comment;
import pt.isep.enorm.rjmn.cr3.CommentType;
import pt.isep.enorm.rjmn.cr3.Cr3Package;
import pt.isep.enorm.rjmn.cr3.ModerationProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.impl.CommentImpl#isReply <em>Reply</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.impl.CommentImpl#isModeration <em>Moderation</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.impl.CommentImpl#getCommentType <em>Comment Type</em>}</li>
 *   <li>{@link pt.isep.enorm.rjmn.cr3.impl.CommentImpl#getModerationProcess <em>Moderation Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends UserFeedbackImpl implements Comment {
	/**
	 * The default value of the '{@link #isReply() <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReply() <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReply()
	 * @generated
	 * @ordered
	 */
	protected boolean reply = REPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isModeration() <em>Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModeration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModeration() <em>Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModeration()
	 * @generated
	 * @ordered
	 */
	protected boolean moderation = MODERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentType() <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentType()
	 * @generated
	 * @ordered
	 */
	protected static final CommentType COMMENT_TYPE_EDEFAULT = CommentType.SIMPLE;

	/**
	 * The cached value of the '{@link #getCommentType() <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentType()
	 * @generated
	 * @ordered
	 */
	protected CommentType commentType = COMMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModerationProcess() <em>Moderation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModerationProcess()
	 * @generated
	 * @ordered
	 */
	protected ModerationProcess moderationProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr3Package.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReply(boolean newReply) {
		boolean oldReply = reply;
		reply = newReply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr3Package.COMMENT__REPLY, oldReply, reply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModeration() {
		return moderation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModeration(boolean newModeration) {
		boolean oldModeration = moderation;
		moderation = newModeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr3Package.COMMENT__MODERATION, oldModeration,
					moderation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentType getCommentType() {
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentType(CommentType newCommentType) {
		CommentType oldCommentType = commentType;
		commentType = newCommentType == null ? COMMENT_TYPE_EDEFAULT : newCommentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr3Package.COMMENT__COMMENT_TYPE, oldCommentType,
					commentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModerationProcess getModerationProcess() {
		return moderationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModerationProcess(ModerationProcess newModerationProcess, NotificationChain msgs) {
		ModerationProcess oldModerationProcess = moderationProcess;
		moderationProcess = newModerationProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Cr3Package.COMMENT__MODERATION_PROCESS, oldModerationProcess, newModerationProcess);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModerationProcess(ModerationProcess newModerationProcess) {
		if (newModerationProcess != moderationProcess) {
			NotificationChain msgs = null;
			if (moderationProcess != null)
				msgs = ((InternalEObject) moderationProcess).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Cr3Package.COMMENT__MODERATION_PROCESS, null, msgs);
			if (newModerationProcess != null)
				msgs = ((InternalEObject) newModerationProcess).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Cr3Package.COMMENT__MODERATION_PROCESS, null, msgs);
			msgs = basicSetModerationProcess(newModerationProcess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr3Package.COMMENT__MODERATION_PROCESS,
					newModerationProcess, newModerationProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr3Package.COMMENT__MODERATION_PROCESS:
			return basicSetModerationProcess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Cr3Package.COMMENT__REPLY:
			return isReply();
		case Cr3Package.COMMENT__MODERATION:
			return isModeration();
		case Cr3Package.COMMENT__COMMENT_TYPE:
			return getCommentType();
		case Cr3Package.COMMENT__MODERATION_PROCESS:
			return getModerationProcess();
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
		case Cr3Package.COMMENT__REPLY:
			setReply((Boolean) newValue);
			return;
		case Cr3Package.COMMENT__MODERATION:
			setModeration((Boolean) newValue);
			return;
		case Cr3Package.COMMENT__COMMENT_TYPE:
			setCommentType((CommentType) newValue);
			return;
		case Cr3Package.COMMENT__MODERATION_PROCESS:
			setModerationProcess((ModerationProcess) newValue);
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
		case Cr3Package.COMMENT__REPLY:
			setReply(REPLY_EDEFAULT);
			return;
		case Cr3Package.COMMENT__MODERATION:
			setModeration(MODERATION_EDEFAULT);
			return;
		case Cr3Package.COMMENT__COMMENT_TYPE:
			setCommentType(COMMENT_TYPE_EDEFAULT);
			return;
		case Cr3Package.COMMENT__MODERATION_PROCESS:
			setModerationProcess((ModerationProcess) null);
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
		case Cr3Package.COMMENT__REPLY:
			return reply != REPLY_EDEFAULT;
		case Cr3Package.COMMENT__MODERATION:
			return moderation != MODERATION_EDEFAULT;
		case Cr3Package.COMMENT__COMMENT_TYPE:
			return commentType != COMMENT_TYPE_EDEFAULT;
		case Cr3Package.COMMENT__MODERATION_PROCESS:
			return moderationProcess != null;
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
		result.append(" (reply: ");
		result.append(reply);
		result.append(", moderation: ");
		result.append(moderation);
		result.append(", commentType: ");
		result.append(commentType);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
