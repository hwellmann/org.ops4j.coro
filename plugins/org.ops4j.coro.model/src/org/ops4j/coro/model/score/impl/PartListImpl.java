/**
 */
package org.ops4j.coro.model.score.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.PartList;
import org.ops4j.coro.model.score.ScorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.PartListImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartListImpl extends MinimalEObjectImpl.Container implements PartList {
	/**
     * The cached value of the '{@link #getParts() <em>Parts</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParts()
     * @generated
     * @ordered
     */
	protected EList<Part> parts;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PartListImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScorePackage.Literals.PART_LIST;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Part> getParts() {
        if (parts == null) {
            parts = new EObjectResolvingEList<Part>(Part.class, this, ScorePackage.PART_LIST__PARTS);
        }
        return parts;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScorePackage.PART_LIST__PARTS:
                return getParts();
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
            case ScorePackage.PART_LIST__PARTS:
                getParts().clear();
                getParts().addAll((Collection<? extends Part>)newValue);
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
            case ScorePackage.PART_LIST__PARTS:
                getParts().clear();
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
            case ScorePackage.PART_LIST__PARTS:
                return parts != null && !parts.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PartListImpl
