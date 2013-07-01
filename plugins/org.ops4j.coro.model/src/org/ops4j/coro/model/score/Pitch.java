/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pitch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Pitch#getOctave <em>Octave</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Pitch#getAlteration <em>Alteration</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Pitch#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getPitch()
 * @model
 * @generated
 */
public interface Pitch extends EObject {
	/**
	 * Returns the value of the '<em><b>Octave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Octave</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Octave</em>' attribute.
	 * @see #setOctave(int)
	 * @see org.ops4j.coro.model.score.ScorePackage#getPitch_Octave()
	 * @model
	 * @generated
	 */
	int getOctave();

	/**
	 * Sets the value of the '{@link org.ops4j.coro.model.score.Pitch#getOctave <em>Octave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octave</em>' attribute.
	 * @see #getOctave()
	 * @generated
	 */
	void setOctave(int value);

	/**
	 * Returns the value of the '<em><b>Alteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alteration</em>' attribute.
	 * @see #setAlteration(float)
	 * @see org.ops4j.coro.model.score.ScorePackage#getPitch_Alteration()
	 * @model
	 * @generated
	 */
	float getAlteration();

	/**
	 * Sets the value of the '{@link org.ops4j.coro.model.score.Pitch#getAlteration <em>Alteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alteration</em>' attribute.
	 * @see #getAlteration()
	 * @generated
	 */
	void setAlteration(float value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ops4j.coro.model.score.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see org.ops4j.coro.model.score.Step
	 * @see #setStep(Step)
	 * @see org.ops4j.coro.model.score.ScorePackage#getPitch_Step()
	 * @model
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link org.ops4j.coro.model.score.Pitch#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see org.ops4j.coro.model.score.Step
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

} // Pitch
