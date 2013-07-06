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

import org.ops4j.coro.model.score.AccidentalType;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.Rest;
import org.ops4j.coro.model.score.ScorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.NoteImpl#getDots <em>Dots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteImpl extends MinimalEObjectImpl.Container implements Note {
	/**
     * The cached value of the '{@link #getPitch() <em>Pitch</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPitch()
     * @generated
     * @ordered
     */
	protected Pitch pitch;

	/**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
	protected static final int DURATION_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
	protected int duration = DURATION_EDEFAULT;

	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final NoteType TYPE_EDEFAULT = NoteType.MAXIMA;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected NoteType type = TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #getAccidental() <em>Accidental</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAccidental()
     * @generated
     * @ordered
     */
	protected static final AccidentalType ACCIDENTAL_EDEFAULT = AccidentalType.NATURAL;

	/**
     * The cached value of the '{@link #getAccidental() <em>Accidental</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAccidental()
     * @generated
     * @ordered
     */
	protected AccidentalType accidental = ACCIDENTAL_EDEFAULT;

	/**
     * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRest()
     * @generated
     * @ordered
     */
    protected Rest rest;

    /**
     * The default value of the '{@link #getDots() <em>Dots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDots()
     * @generated
     * @ordered
     */
    protected static final int DOTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDots() <em>Dots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDots()
     * @generated
     * @ordered
     */
    protected int dots = DOTS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NoteImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScorePackage.Literals.NOTE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Pitch getPitch() {
        return pitch;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPitch(Pitch newPitch, NotificationChain msgs) {
        Pitch oldPitch = pitch;
        pitch = newPitch;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__PITCH, oldPitch, newPitch);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPitch(Pitch newPitch) {
        if (newPitch != pitch) {
            NotificationChain msgs = null;
            if (pitch != null)
                msgs = ((InternalEObject)pitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScorePackage.NOTE__PITCH, null, msgs);
            if (newPitch != null)
                msgs = ((InternalEObject)newPitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScorePackage.NOTE__PITCH, null, msgs);
            msgs = basicSetPitch(newPitch, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__PITCH, newPitch, newPitch));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getDuration() {
        return duration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDuration(int newDuration) {
        int oldDuration = duration;
        duration = newDuration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__DURATION, oldDuration, duration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NoteType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(NoteType newType) {
        NoteType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AccidentalType getAccidental() {
        return accidental;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAccidental(AccidentalType newAccidental) {
        AccidentalType oldAccidental = accidental;
        accidental = newAccidental == null ? ACCIDENTAL_EDEFAULT : newAccidental;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__ACCIDENTAL, oldAccidental, accidental));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Measure getMeasure() {
        if (eContainerFeatureID() != ScorePackage.NOTE__MEASURE) return null;
        return (Measure)eInternalContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newMeasure, ScorePackage.NOTE__MEASURE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMeasure(Measure newMeasure) {
        if (newMeasure != eInternalContainer() || (eContainerFeatureID() != ScorePackage.NOTE__MEASURE && newMeasure != null)) {
            if (EcoreUtil.isAncestor(this, newMeasure))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMeasure != null)
                msgs = ((InternalEObject)newMeasure).eInverseAdd(this, ScorePackage.MEASURE__NOTES, Measure.class, msgs);
            msgs = basicSetMeasure(newMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__MEASURE, newMeasure, newMeasure));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rest getRest() {
        return rest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRest(Rest newRest, NotificationChain msgs) {
        Rest oldRest = rest;
        rest = newRest;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__REST, oldRest, newRest);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRest(Rest newRest) {
        if (newRest != rest) {
            NotificationChain msgs = null;
            if (rest != null)
                msgs = ((InternalEObject)rest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScorePackage.NOTE__REST, null, msgs);
            if (newRest != null)
                msgs = ((InternalEObject)newRest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScorePackage.NOTE__REST, null, msgs);
            msgs = basicSetRest(newRest, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__REST, newRest, newRest));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDots() {
        return dots;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDots(int newDots) {
        int oldDots = dots;
        dots = newDots;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.NOTE__DOTS, oldDots, dots));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScorePackage.NOTE__MEASURE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetMeasure((Measure)otherEnd, msgs);
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
            case ScorePackage.NOTE__PITCH:
                return basicSetPitch(null, msgs);
            case ScorePackage.NOTE__MEASURE:
                return basicSetMeasure(null, msgs);
            case ScorePackage.NOTE__REST:
                return basicSetRest(null, msgs);
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
            case ScorePackage.NOTE__MEASURE:
                return eInternalContainer().eInverseRemove(this, ScorePackage.MEASURE__NOTES, Measure.class, msgs);
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
            case ScorePackage.NOTE__PITCH:
                return getPitch();
            case ScorePackage.NOTE__DURATION:
                return getDuration();
            case ScorePackage.NOTE__TYPE:
                return getType();
            case ScorePackage.NOTE__ACCIDENTAL:
                return getAccidental();
            case ScorePackage.NOTE__MEASURE:
                return getMeasure();
            case ScorePackage.NOTE__REST:
                return getRest();
            case ScorePackage.NOTE__DOTS:
                return getDots();
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
            case ScorePackage.NOTE__PITCH:
                setPitch((Pitch)newValue);
                return;
            case ScorePackage.NOTE__DURATION:
                setDuration((Integer)newValue);
                return;
            case ScorePackage.NOTE__TYPE:
                setType((NoteType)newValue);
                return;
            case ScorePackage.NOTE__ACCIDENTAL:
                setAccidental((AccidentalType)newValue);
                return;
            case ScorePackage.NOTE__MEASURE:
                setMeasure((Measure)newValue);
                return;
            case ScorePackage.NOTE__REST:
                setRest((Rest)newValue);
                return;
            case ScorePackage.NOTE__DOTS:
                setDots((Integer)newValue);
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
            case ScorePackage.NOTE__PITCH:
                setPitch((Pitch)null);
                return;
            case ScorePackage.NOTE__DURATION:
                setDuration(DURATION_EDEFAULT);
                return;
            case ScorePackage.NOTE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ScorePackage.NOTE__ACCIDENTAL:
                setAccidental(ACCIDENTAL_EDEFAULT);
                return;
            case ScorePackage.NOTE__MEASURE:
                setMeasure((Measure)null);
                return;
            case ScorePackage.NOTE__REST:
                setRest((Rest)null);
                return;
            case ScorePackage.NOTE__DOTS:
                setDots(DOTS_EDEFAULT);
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
            case ScorePackage.NOTE__PITCH:
                return pitch != null;
            case ScorePackage.NOTE__DURATION:
                return duration != DURATION_EDEFAULT;
            case ScorePackage.NOTE__TYPE:
                return type != TYPE_EDEFAULT;
            case ScorePackage.NOTE__ACCIDENTAL:
                return accidental != ACCIDENTAL_EDEFAULT;
            case ScorePackage.NOTE__MEASURE:
                return getMeasure() != null;
            case ScorePackage.NOTE__REST:
                return rest != null;
            case ScorePackage.NOTE__DOTS:
                return dots != DOTS_EDEFAULT;
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
        result.append(" (duration: ");
        result.append(duration);
        result.append(", type: ");
        result.append(type);
        result.append(", accidental: ");
        result.append(accidental);
        result.append(", dots: ");
        result.append(dots);
        result.append(')');
        return result.toString();
    }

} //NoteImpl
