/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Note#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Note#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Note#getType <em>Type</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Note#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Note#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Note#getRest <em>Rest</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Note#getDots <em>Dots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
     * Returns the value of the '<em><b>Pitch</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pitch</em>' containment reference.
     * @see #setPitch(Pitch)
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Pitch()
     * @model containment="true"
     * @generated
     */
	Pitch getPitch();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getPitch <em>Pitch</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pitch</em>' containment reference.
     * @see #getPitch()
     * @generated
     */
	void setPitch(Pitch value);

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
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Duration()
     * @model
     * @generated
     */
	int getDuration();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' attribute.
     * @see #getDuration()
     * @generated
     */
	void setDuration(int value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.ops4j.coro.model.score.NoteType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.ops4j.coro.model.score.NoteType
     * @see #setType(NoteType)
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Type()
     * @model
     * @generated
     */
	NoteType getType();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.ops4j.coro.model.score.NoteType
     * @see #getType()
     * @generated
     */
	void setType(NoteType value);

	/**
     * Returns the value of the '<em><b>Accidental</b></em>' attribute.
     * The literals are from the enumeration {@link org.ops4j.coro.model.score.AccidentalType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accidental</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Accidental</em>' attribute.
     * @see org.ops4j.coro.model.score.AccidentalType
     * @see #setAccidental(AccidentalType)
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Accidental()
     * @model
     * @generated
     */
	AccidentalType getAccidental();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getAccidental <em>Accidental</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accidental</em>' attribute.
     * @see org.ops4j.coro.model.score.AccidentalType
     * @see #getAccidental()
     * @generated
     */
	void setAccidental(AccidentalType value);

	/**
     * Returns the value of the '<em><b>Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.ops4j.coro.model.score.Measure#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Measure</em>' container reference.
     * @see #setMeasure(Measure)
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Measure()
     * @see org.ops4j.coro.model.score.Measure#getNotes
     * @model opposite="notes" transient="false"
     * @generated
     */
	Measure getMeasure();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getMeasure <em>Measure</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measure</em>' container reference.
     * @see #getMeasure()
     * @generated
     */
	void setMeasure(Measure value);

    /**
     * Returns the value of the '<em><b>Rest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rest</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rest</em>' containment reference.
     * @see #setRest(Rest)
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Rest()
     * @model containment="true"
     * @generated
     */
    Rest getRest();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getRest <em>Rest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rest</em>' containment reference.
     * @see #getRest()
     * @generated
     */
    void setRest(Rest value);

    /**
     * Returns the value of the '<em><b>Dots</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dots</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dots</em>' attribute.
     * @see #setDots(int)
     * @see org.ops4j.coro.model.score.ScorePackage#getNote_Dots()
     * @model
     * @generated
     */
    int getDots();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Note#getDots <em>Dots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dots</em>' attribute.
     * @see #getDots()
     * @generated
     */
    void setDots(int value);

} // Note
