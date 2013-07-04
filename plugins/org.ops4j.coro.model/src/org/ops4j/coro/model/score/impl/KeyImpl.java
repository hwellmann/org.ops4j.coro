/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ops4j.coro.model.score.Key;
import org.ops4j.coro.model.score.ScorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.KeyImpl#getFifths <em>Fifths</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.KeyImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key {
	/**
     * The default value of the '{@link #getFifths() <em>Fifths</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFifths()
     * @generated
     * @ordered
     */
	protected static final int FIFTHS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getFifths() <em>Fifths</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFifths()
     * @generated
     * @ordered
     */
	protected int fifths = FIFTHS_EDEFAULT;

	/**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
	protected static final String MODE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
	protected String mode = MODE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected KeyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScorePackage.Literals.KEY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getFifths() {
        return fifths;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFifths(int newFifths) {
        int oldFifths = fifths;
        fifths = newFifths;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.KEY__FIFTHS, oldFifths, fifths));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMode() {
        return mode;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMode(String newMode) {
        String oldMode = mode;
        mode = newMode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.KEY__MODE, oldMode, mode));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScorePackage.KEY__FIFTHS:
                return getFifths();
            case ScorePackage.KEY__MODE:
                return getMode();
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
            case ScorePackage.KEY__FIFTHS:
                setFifths((Integer)newValue);
                return;
            case ScorePackage.KEY__MODE:
                setMode((String)newValue);
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
            case ScorePackage.KEY__FIFTHS:
                setFifths(FIFTHS_EDEFAULT);
                return;
            case ScorePackage.KEY__MODE:
                setMode(MODE_EDEFAULT);
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
            case ScorePackage.KEY__FIFTHS:
                return fifths != FIFTHS_EDEFAULT;
            case ScorePackage.KEY__MODE:
                return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
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
        result.append(" (fifths: ");
        result.append(fifths);
        result.append(", mode: ");
        result.append(mode);
        result.append(')');
        return result.toString();
    }

} //KeyImpl
