/**
 */
package pt.isep.enorm.atb.cr2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.enorm.atb.cr2.Cr2Package;
import pt.isep.enorm.atb.cr2.ModerationProcess;
import pt.isep.enorm.atb.cr2.Step;
import pt.isep.enorm.atb.cr2.ValidationStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moderation Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl#getStep <em>Step</em>}</li>
 *   <li>{@link pt.isep.enorm.atb.cr2.impl.ModerationProcessImpl#getStartStep <em>Start Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModerationProcessImpl extends MinimalEObjectImpl.Container implements ModerationProcess {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The cached value of the '{@link #getStartStep() <em>Start Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStep()
	 * @generated
	 * @ordered
	 */
	protected ValidationStep startStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModerationProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.MODERATION_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.MODERATION_PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, Cr2Package.MODERATION_PROCESS__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationStep getStartStep() {
		if (startStep != null && startStep.eIsProxy()) {
			InternalEObject oldStartStep = (InternalEObject) startStep;
			startStep = (ValidationStep) eResolveProxy(oldStartStep);
			if (startStep != oldStartStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cr2Package.MODERATION_PROCESS__START_STEP,
							oldStartStep, startStep));
			}
		}
		return startStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStep basicGetStartStep() {
		return startStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartStep(ValidationStep newStartStep) {
		ValidationStep oldStartStep = startStep;
		startStep = newStartStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.MODERATION_PROCESS__START_STEP,
					oldStartStep, startStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.MODERATION_PROCESS__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
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
		case Cr2Package.MODERATION_PROCESS__NAME:
			return getName();
		case Cr2Package.MODERATION_PROCESS__STEP:
			return getStep();
		case Cr2Package.MODERATION_PROCESS__START_STEP:
			if (resolve)
				return getStartStep();
			return basicGetStartStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Cr2Package.MODERATION_PROCESS__NAME:
			setName((String) newValue);
			return;
		case Cr2Package.MODERATION_PROCESS__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
			return;
		case Cr2Package.MODERATION_PROCESS__START_STEP:
			setStartStep((ValidationStep) newValue);
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
		case Cr2Package.MODERATION_PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Cr2Package.MODERATION_PROCESS__STEP:
			getStep().clear();
			return;
		case Cr2Package.MODERATION_PROCESS__START_STEP:
			setStartStep((ValidationStep) null);
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
		case Cr2Package.MODERATION_PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Cr2Package.MODERATION_PROCESS__STEP:
			return step != null && !step.isEmpty();
		case Cr2Package.MODERATION_PROCESS__START_STEP:
			return startStep != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModerationProcessImpl
