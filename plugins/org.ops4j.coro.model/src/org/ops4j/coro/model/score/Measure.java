/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getKey <em>Key</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getTime <em>Time</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getClef <em>Clef</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getPart <em>Part</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getBarLines <em>Bar Lines</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getDivisions <em>Divisions</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Measure#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
	/**
     * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
     * The list contents are of type {@link org.ops4j.coro.model.score.Note}.
     * It is bidirectional and its opposite is '{@link org.ops4j.coro.model.score.Note#getMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Notes</em>' containment reference list.
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Notes()
     * @see org.ops4j.coro.model.score.Note#getMeasure
     * @model opposite="measure" containment="true"
     * @generated
     */
	EList<Note> getNotes();

	/**
     * Returns the value of the '<em><b>Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' containment reference.
     * @see #setKey(Key)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Key()
     * @model containment="true"
     * @generated
     */
	Key getKey();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getKey <em>Key</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' containment reference.
     * @see #getKey()
     * @generated
     */
	void setKey(Key value);

	/**
     * Returns the value of the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' containment reference.
     * @see #setTime(Time)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Time()
     * @model containment="true"
     * @generated
     */
	Time getTime();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getTime <em>Time</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' containment reference.
     * @see #getTime()
     * @generated
     */
	void setTime(Time value);

	/**
     * Returns the value of the '<em><b>Clef</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Clef</em>' containment reference.
     * @see #setClef(Clef)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Clef()
     * @model containment="true"
     * @generated
     */
	Clef getClef();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getClef <em>Clef</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clef</em>' containment reference.
     * @see #getClef()
     * @generated
     */
	void setClef(Clef value);

	/**
     * Returns the value of the '<em><b>Part</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.ops4j.coro.model.score.Part#getMeasures <em>Measures</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Part</em>' container reference.
     * @see #setPart(Part)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Part()
     * @see org.ops4j.coro.model.score.Part#getMeasures
     * @model opposite="measures" required="true" transient="false"
     * @generated
     */
	Part getPart();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getPart <em>Part</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Part</em>' container reference.
     * @see #getPart()
     * @generated
     */
	void setPart(Part value);

    /**
     * Returns the value of the '<em><b>Marker</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Marker</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Marker</em>' attribute.
     * @see #setMarker(String)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Marker()
     * @model
     * @generated
     */
    String getMarker();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getMarker <em>Marker</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Marker</em>' attribute.
     * @see #getMarker()
     * @generated
     */
    void setMarker(String value);

    /**
     * Returns the value of the '<em><b>Bar Lines</b></em>' containment reference list.
     * The list contents are of type {@link org.ops4j.coro.model.score.BarLine}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bar Lines</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bar Lines</em>' containment reference list.
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_BarLines()
     * @model containment="true"
     * @generated
     */
    EList<BarLine> getBarLines();

    /**
     * Returns the value of the '<em><b>Divisions</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Divisions</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Divisions</em>' attribute.
     * @see #setDivisions(int)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Divisions()
     * @model
     * @generated
     */
    int getDivisions();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getDivisions <em>Divisions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Divisions</em>' attribute.
     * @see #getDivisions()
     * @generated
     */
    void setDivisions(int value);

    /**
     * Returns the value of the '<em><b>Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #setDuration(int)
     * @see org.ops4j.coro.model.score.ScorePackage#getMeasure_Duration()
     * @model
     * @generated
     */
    int getDuration();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Measure#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' attribute.
     * @see #getDuration()
     * @generated
     */
    void setDuration(int value);

} // Measure
