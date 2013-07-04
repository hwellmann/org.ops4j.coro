/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ops4j.coro.model.score.Clef;
import org.ops4j.coro.model.score.ClefSign;
import org.ops4j.coro.model.score.ScorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.ClefImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.ClefImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.ClefImpl#getOctaveChange <em>Octave Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClefImpl extends MinimalEObjectImpl.Container implements Clef {
	/**
     * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSign()
     * @generated
     * @ordered
     */
	protected static final ClefSign SIGN_EDEFAULT = ClefSign.C;

	/**
     * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSign()
     * @generated
     * @ordered
     */
	protected ClefSign sign = SIGN_EDEFAULT;

	/**
     * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLine()
     * @generated
     * @ordered
     */
	protected static final int LINE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLine()
     * @generated
     * @ordered
     */
	protected int line = LINE_EDEFAULT;

	/**
     * The default value of the '{@link #getOctaveChange() <em>Octave Change</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOctaveChange()
     * @generated
     * @ordered
     */
	protected static final int OCTAVE_CHANGE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getOctaveChange() <em>Octave Change</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOctaveChange()
     * @generated
     * @ordered
     */
	protected int octaveChange = OCTAVE_CHANGE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ClefImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScorePackage.Literals.CLEF;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ClefSign getSign() {
        return sign;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSign(ClefSign newSign) {
        ClefSign oldSign = sign;
        sign = newSign == null ? SIGN_EDEFAULT : newSign;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.CLEF__SIGN, oldSign, sign));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getLine() {
        return line;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLine(int newLine) {
        int oldLine = line;
        line = newLine;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.CLEF__LINE, oldLine, line));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getOctaveChange() {
        return octaveChange;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOctaveChange(int newOctaveChange) {
        int oldOctaveChange = octaveChange;
        octaveChange = newOctaveChange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.CLEF__OCTAVE_CHANGE, oldOctaveChange, octaveChange));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScorePackage.CLEF__SIGN:
                return getSign();
            case ScorePackage.CLEF__LINE:
                return getLine();
            case ScorePackage.CLEF__OCTAVE_CHANGE:
                return getOctaveChange();
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
            case ScorePackage.CLEF__SIGN:
                setSign((ClefSign)newValue);
                return;
            case ScorePackage.CLEF__LINE:
                setLine((Integer)newValue);
                return;
            case ScorePackage.CLEF__OCTAVE_CHANGE:
                setOctaveChange((Integer)newValue);
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
            case ScorePackage.CLEF__SIGN:
                setSign(SIGN_EDEFAULT);
                return;
            case ScorePackage.CLEF__LINE:
                setLine(LINE_EDEFAULT);
                return;
            case ScorePackage.CLEF__OCTAVE_CHANGE:
                setOctaveChange(OCTAVE_CHANGE_EDEFAULT);
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
            case ScorePackage.CLEF__SIGN:
                return sign != SIGN_EDEFAULT;
            case ScorePackage.CLEF__LINE:
                return line != LINE_EDEFAULT;
            case ScorePackage.CLEF__OCTAVE_CHANGE:
                return octaveChange != OCTAVE_CHANGE_EDEFAULT;
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
        result.append(" (sign: ");
        result.append(sign);
        result.append(", line: ");
        result.append(line);
        result.append(", octaveChange: ");
        result.append(octaveChange);
        result.append(')');
        return result.toString();
    }

} //ClefImpl
