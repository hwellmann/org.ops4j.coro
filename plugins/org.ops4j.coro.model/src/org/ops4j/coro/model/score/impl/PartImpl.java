/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.Score;
import org.ops4j.coro.model.score.ScorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.PartImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.PartImpl#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends MinimalEObjectImpl.Container implements Part {
	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected Measure measures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScorePackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getMeasures() {
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasures(Measure newMeasures, NotificationChain msgs) {
		Measure oldMeasures = measures;
		measures = newMeasures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScorePackage.PART__MEASURES, oldMeasures, newMeasures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasures(Measure newMeasures) {
		if (newMeasures != measures) {
			NotificationChain msgs = null;
			if (measures != null)
				msgs = ((InternalEObject)measures).eInverseRemove(this, ScorePackage.MEASURE__PART, Measure.class, msgs);
			if (newMeasures != null)
				msgs = ((InternalEObject)newMeasures).eInverseAdd(this, ScorePackage.MEASURE__PART, Measure.class, msgs);
			msgs = basicSetMeasures(newMeasures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.PART__MEASURES, newMeasures, newMeasures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score getScore() {
		if (eContainerFeatureID() != ScorePackage.PART__SCORE) return null;
		return (Score)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Score newScore, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScore, ScorePackage.PART__SCORE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Score newScore) {
		if (newScore != eInternalContainer() || (eContainerFeatureID() != ScorePackage.PART__SCORE && newScore != null)) {
			if (EcoreUtil.isAncestor(this, newScore))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, ScorePackage.SCORE__PARTS, Score.class, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.PART__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScorePackage.PART__MEASURES:
				if (measures != null)
					msgs = ((InternalEObject)measures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScorePackage.PART__MEASURES, null, msgs);
				return basicSetMeasures((Measure)otherEnd, msgs);
			case ScorePackage.PART__SCORE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScore((Score)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScorePackage.PART__MEASURES:
				return basicSetMeasures(null, msgs);
			case ScorePackage.PART__SCORE:
				return basicSetScore(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ScorePackage.PART__SCORE:
				return eInternalContainer().eInverseRemove(this, ScorePackage.SCORE__PARTS, Score.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScorePackage.PART__MEASURES:
				return getMeasures();
			case ScorePackage.PART__SCORE:
				return getScore();
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
			case ScorePackage.PART__MEASURES:
				setMeasures((Measure)newValue);
				return;
			case ScorePackage.PART__SCORE:
				setScore((Score)newValue);
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
			case ScorePackage.PART__MEASURES:
				setMeasures((Measure)null);
				return;
			case ScorePackage.PART__SCORE:
				setScore((Score)null);
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
			case ScorePackage.PART__MEASURES:
				return measures != null;
			case ScorePackage.PART__SCORE:
				return getScore() != null;
		}
		return super.eIsSet(featureID);
	}

} //PartImpl
