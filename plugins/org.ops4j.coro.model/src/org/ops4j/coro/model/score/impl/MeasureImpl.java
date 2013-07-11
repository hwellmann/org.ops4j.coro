/**
 */
package org.ops4j.coro.model.score.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ops4j.coro.model.score.BarLine;
import org.ops4j.coro.model.score.Clef;
import org.ops4j.coro.model.score.Key;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.ScorePackage;
import org.ops4j.coro.model.score.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getClef <em>Clef</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.impl.MeasureImpl#getBarLines <em>Bar Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureImpl extends MinimalEObjectImpl.Container implements Measure {
	/**
     * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNotes()
     * @generated
     * @ordered
     */
	protected EList<Note> notes;

	/**
     * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
	protected Key key;

	/**
     * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
	protected Time time;

	/**
     * The cached value of the '{@link #getClef() <em>Clef</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClef()
     * @generated
     * @ordered
     */
	protected Clef clef;

	/**
     * The default value of the '{@link #getMarker() <em>Marker</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarker()
     * @generated
     * @ordered
     */
    protected static final String MARKER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMarker() <em>Marker</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarker()
     * @generated
     * @ordered
     */
    protected String marker = MARKER_EDEFAULT;

    /**
     * The cached value of the '{@link #getBarLines() <em>Bar Lines</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBarLines()
     * @generated
     * @ordered
     */
    protected EList<BarLine> barLines;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MeasureImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScorePackage.Literals.MEASURE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Note> getNotes() {
        if (notes == null) {
            notes = new EObjectContainmentWithInverseEList<Note>(Note.class, this, ScorePackage.MEASURE__NOTES, ScorePackage.NOTE__MEASURE);
        }
        return notes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Key getKey() {
        return key;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetKey(Key newKey, NotificationChain msgs) {
        Key oldKey = key;
        key = newKey;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__KEY, oldKey, newKey);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKey(Key newKey) {
        if (newKey != key) {
            NotificationChain msgs = null;
            if (key != null)
                msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScorePackage.MEASURE__KEY, null, msgs);
            if (newKey != null)
                msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScorePackage.MEASURE__KEY, null, msgs);
            msgs = basicSetKey(newKey, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__KEY, newKey, newKey));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Time getTime() {
        return time;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTime(Time newTime, NotificationChain msgs) {
        Time oldTime = time;
        time = newTime;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__TIME, oldTime, newTime);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTime(Time newTime) {
        if (newTime != time) {
            NotificationChain msgs = null;
            if (time != null)
                msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScorePackage.MEASURE__TIME, null, msgs);
            if (newTime != null)
                msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScorePackage.MEASURE__TIME, null, msgs);
            msgs = basicSetTime(newTime, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__TIME, newTime, newTime));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Clef getClef() {
        return clef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetClef(Clef newClef, NotificationChain msgs) {
        Clef oldClef = clef;
        clef = newClef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__CLEF, oldClef, newClef);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClef(Clef newClef) {
        if (newClef != clef) {
            NotificationChain msgs = null;
            if (clef != null)
                msgs = ((InternalEObject)clef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScorePackage.MEASURE__CLEF, null, msgs);
            if (newClef != null)
                msgs = ((InternalEObject)newClef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScorePackage.MEASURE__CLEF, null, msgs);
            msgs = basicSetClef(newClef, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__CLEF, newClef, newClef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Part getPart() {
        if (eContainerFeatureID() != ScorePackage.MEASURE__PART) return null;
        return (Part)eInternalContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPart(Part newPart, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPart, ScorePackage.MEASURE__PART, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPart(Part newPart) {
        if (newPart != eInternalContainer() || (eContainerFeatureID() != ScorePackage.MEASURE__PART && newPart != null)) {
            if (EcoreUtil.isAncestor(this, newPart))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPart != null)
                msgs = ((InternalEObject)newPart).eInverseAdd(this, ScorePackage.PART__MEASURES, Part.class, msgs);
            msgs = basicSetPart(newPart, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__PART, newPart, newPart));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMarker(String newMarker) {
        String oldMarker = marker;
        marker = newMarker;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScorePackage.MEASURE__MARKER, oldMarker, marker));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BarLine> getBarLines() {
        if (barLines == null) {
            barLines = new EObjectContainmentEList<BarLine>(BarLine.class, this, ScorePackage.MEASURE__BAR_LINES);
        }
        return barLines;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScorePackage.MEASURE__NOTES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getNotes()).basicAdd(otherEnd, msgs);
            case ScorePackage.MEASURE__PART:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPart((Part)otherEnd, msgs);
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
            case ScorePackage.MEASURE__NOTES:
                return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
            case ScorePackage.MEASURE__KEY:
                return basicSetKey(null, msgs);
            case ScorePackage.MEASURE__TIME:
                return basicSetTime(null, msgs);
            case ScorePackage.MEASURE__CLEF:
                return basicSetClef(null, msgs);
            case ScorePackage.MEASURE__PART:
                return basicSetPart(null, msgs);
            case ScorePackage.MEASURE__BAR_LINES:
                return ((InternalEList<?>)getBarLines()).basicRemove(otherEnd, msgs);
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
            case ScorePackage.MEASURE__PART:
                return eInternalContainer().eInverseRemove(this, ScorePackage.PART__MEASURES, Part.class, msgs);
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
            case ScorePackage.MEASURE__NOTES:
                return getNotes();
            case ScorePackage.MEASURE__KEY:
                return getKey();
            case ScorePackage.MEASURE__TIME:
                return getTime();
            case ScorePackage.MEASURE__CLEF:
                return getClef();
            case ScorePackage.MEASURE__PART:
                return getPart();
            case ScorePackage.MEASURE__MARKER:
                return getMarker();
            case ScorePackage.MEASURE__BAR_LINES:
                return getBarLines();
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
            case ScorePackage.MEASURE__NOTES:
                getNotes().clear();
                getNotes().addAll((Collection<? extends Note>)newValue);
                return;
            case ScorePackage.MEASURE__KEY:
                setKey((Key)newValue);
                return;
            case ScorePackage.MEASURE__TIME:
                setTime((Time)newValue);
                return;
            case ScorePackage.MEASURE__CLEF:
                setClef((Clef)newValue);
                return;
            case ScorePackage.MEASURE__PART:
                setPart((Part)newValue);
                return;
            case ScorePackage.MEASURE__MARKER:
                setMarker((String)newValue);
                return;
            case ScorePackage.MEASURE__BAR_LINES:
                getBarLines().clear();
                getBarLines().addAll((Collection<? extends BarLine>)newValue);
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
            case ScorePackage.MEASURE__NOTES:
                getNotes().clear();
                return;
            case ScorePackage.MEASURE__KEY:
                setKey((Key)null);
                return;
            case ScorePackage.MEASURE__TIME:
                setTime((Time)null);
                return;
            case ScorePackage.MEASURE__CLEF:
                setClef((Clef)null);
                return;
            case ScorePackage.MEASURE__PART:
                setPart((Part)null);
                return;
            case ScorePackage.MEASURE__MARKER:
                setMarker(MARKER_EDEFAULT);
                return;
            case ScorePackage.MEASURE__BAR_LINES:
                getBarLines().clear();
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
            case ScorePackage.MEASURE__NOTES:
                return notes != null && !notes.isEmpty();
            case ScorePackage.MEASURE__KEY:
                return key != null;
            case ScorePackage.MEASURE__TIME:
                return time != null;
            case ScorePackage.MEASURE__CLEF:
                return clef != null;
            case ScorePackage.MEASURE__PART:
                return getPart() != null;
            case ScorePackage.MEASURE__MARKER:
                return MARKER_EDEFAULT == null ? marker != null : !MARKER_EDEFAULT.equals(marker);
            case ScorePackage.MEASURE__BAR_LINES:
                return barLines != null && !barLines.isEmpty();
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
        result.append(" (marker: ");
        result.append(marker);
        result.append(')');
        return result.toString();
    }

} //MeasureImpl
