/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ops4j.coro.model.score.Rest;
import org.ops4j.coro.model.score.ScorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.RestImpl#isMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestImpl extends MinimalEObjectImpl.Container implements Rest {
    /**
     * The default value of the '{@link #isMeasure() <em>Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMeasure()
     * @generated
     * @ordered
     */
    protected static final boolean MEASURE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMeasure() <em>Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMeasure()
     * @generated
     * @ordered
     */
    protected boolean measure = MEASURE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScorePackage.Literals.REST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMeasure() {
        return measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasure(boolean newMeasure) {
        boolean oldMeasure = measure;
        measure = newMeasure;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.REST__MEASURE, oldMeasure, measure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScorePackage.REST__MEASURE:
                return isMeasure();
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
            case ScorePackage.REST__MEASURE:
                setMeasure((Boolean)newValue);
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
            case ScorePackage.REST__MEASURE:
                setMeasure(MEASURE_EDEFAULT);
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
            case ScorePackage.REST__MEASURE:
                return measure != MEASURE_EDEFAULT;
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
        result.append(" (measure: ");
        result.append(measure);
        result.append(')');
        return result.toString();
    }

} //RestImpl
