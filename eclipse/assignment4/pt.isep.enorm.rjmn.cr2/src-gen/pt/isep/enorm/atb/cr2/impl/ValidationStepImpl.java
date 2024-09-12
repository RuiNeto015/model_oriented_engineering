/**
 */
package pt.isep.enorm.atb.cr2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.isep.enorm.atb.cr2.Cr2Package;
import pt.isep.enorm.atb.cr2.Step;
import pt.isep.enorm.atb.cr2.ValidationStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.atb.cr2.impl.ValidationStepImpl#getNextApprove <em>Next Approve</em>}</li>
 *   <li>{@link pt.isep.enorm.atb.cr2.impl.ValidationStepImpl#getNextReject <em>Next Reject</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValidationStepImpl extends StepImpl implements ValidationStep {
	/**
	 * The cached value of the '{@link #getNextApprove() <em>Next Approve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextApprove()
	 * @generated
	 * @ordered
	 */
	protected Step nextApprove;

	/**
	 * The cached value of the '{@link #getNextReject() <em>Next Reject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextReject()
	 * @generated
	 * @ordered
	 */
	protected Step nextReject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.VALIDATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getNextApprove() {
		if (nextApprove != null && nextApprove.eIsProxy()) {
			InternalEObject oldNextApprove = (InternalEObject) nextApprove;
			nextApprove = (Step) eResolveProxy(oldNextApprove);
			if (nextApprove != oldNextApprove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cr2Package.VALIDATION_STEP__NEXT_APPROVE,
							oldNextApprove, nextApprove));
			}
		}
		return nextApprove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetNextApprove() {
		return nextApprove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextApprove(Step newNextApprove) {
		Step oldNextApprove = nextApprove;
		nextApprove = newNextApprove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.VALIDATION_STEP__NEXT_APPROVE,
					oldNextApprove, nextApprove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getNextReject() {
		if (nextReject != null && nextReject.eIsProxy()) {
			InternalEObject oldNextReject = (InternalEObject) nextReject;
			nextReject = (Step) eResolveProxy(oldNextReject);
			if (nextReject != oldNextReject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cr2Package.VALIDATION_STEP__NEXT_REJECT,
							oldNextReject, nextReject));
			}
		}
		return nextReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetNextReject() {
		return nextReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextReject(Step newNextReject) {
		Step oldNextReject = nextReject;
		nextReject = newNextReject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.VALIDATION_STEP__NEXT_REJECT,
					oldNextReject, nextReject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			if (resolve)
				return getNextApprove();
			return basicGetNextApprove();
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			if (resolve)
				return getNextReject();
			return basicGetNextReject();
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
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			setNextApprove((Step) newValue);
			return;
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			setNextReject((Step) newValue);
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
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			setNextApprove((Step) null);
			return;
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			setNextReject((Step) null);
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
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			return nextApprove != null;
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			return nextReject != null;
		}
		return super.eIsSet(featureID);
	}

} //ValidationStepImpl
