/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.ScorePackage;
import org.ops4j.coro.model.score.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pitch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.PitchImpl#getOctave <em>Octave</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.PitchImpl#getAlteration <em>Alteration</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.PitchImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PitchImpl extends MinimalEObjectImpl.Container implements Pitch {
	/**
     * The default value of the '{@link #getOctave() <em>Octave</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOctave()
     * @generated
     * @ordered
     */
	protected static final int OCTAVE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getOctave() <em>Octave</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOctave()
     * @generated
     * @ordered
     */
	protected int octave = OCTAVE_EDEFAULT;

	/**
     * The default value of the '{@link #getAlteration() <em>Alteration</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlteration()
     * @generated
     * @ordered
     */
	protected static final float ALTERATION_EDEFAULT = 0.0F;

	/**
     * The cached value of the '{@link #getAlteration() <em>Alteration</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlteration()
     * @generated
     * @ordered
     */
	protected float alteration = ALTERATION_EDEFAULT;

	/**
     * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
	protected static final Step STEP_EDEFAULT = Step.C;

	/**
     * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
	protected Step step = STEP_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PitchImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScorePackage.Literals.PITCH;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getOctave() {
        return octave;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOctave(int newOctave) {
        int oldOctave = octave;
        octave = newOctave;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.PITCH__OCTAVE, oldOctave, octave));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public float getAlteration() {
        return alteration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAlteration(float newAlteration) {
        float oldAlteration = alteration;
        alteration = newAlteration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.PITCH__ALTERATION, oldAlteration, alteration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Step getStep() {
        return step;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStep(Step newStep) {
        Step oldStep = step;
        step = newStep == null ? STEP_EDEFAULT : newStep;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.PITCH__STEP, oldStep, step));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScorePackage.PITCH__OCTAVE:
                return getOctave();
            case ScorePackage.PITCH__ALTERATION:
                return getAlteration();
            case ScorePackage.PITCH__STEP:
                return getStep();
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
            case ScorePackage.PITCH__OCTAVE:
                setOctave((Integer)newValue);
                return;
            case ScorePackage.PITCH__ALTERATION:
                setAlteration((Float)newValue);
                return;
            case ScorePackage.PITCH__STEP:
                setStep((Step)newValue);
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
            case ScorePackage.PITCH__OCTAVE:
                setOctave(OCTAVE_EDEFAULT);
                return;
            case ScorePackage.PITCH__ALTERATION:
                setAlteration(ALTERATION_EDEFAULT);
                return;
            case ScorePackage.PITCH__STEP:
                setStep(STEP_EDEFAULT);
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
            case ScorePackage.PITCH__OCTAVE:
                return octave != OCTAVE_EDEFAULT;
            case ScorePackage.PITCH__ALTERATION:
                return alteration != ALTERATION_EDEFAULT;
            case ScorePackage.PITCH__STEP:
                return step != STEP_EDEFAULT;
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (octave: ");
        result.append(octave);
        result.append(", alteration: ");
        result.append(alteration);
        result.append(", step: ");
        result.append(step);
        result.append(')');
        return result.toString();
    }

} //PitchImpl
