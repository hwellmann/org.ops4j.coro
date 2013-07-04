/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Clef#getSign <em>Sign</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Clef#getLine <em>Line</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Clef#getOctaveChange <em>Octave Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getClef()
 * @model
 * @generated
 */
public interface Clef extends EObject {
	/**
     * Returns the value of the '<em><b>Sign</b></em>' attribute.
     * The literals are from the enumeration {@link org.ops4j.coro.model.score.ClefSign}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sign</em>' attribute.
     * @see org.ops4j.coro.model.score.ClefSign
     * @see #setSign(ClefSign)
     * @see org.ops4j.coro.model.score.ScorePackage#getClef_Sign()
     * @model required="true"
     * @generated
     */
	ClefSign getSign();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Clef#getSign <em>Sign</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sign</em>' attribute.
     * @see org.ops4j.coro.model.score.ClefSign
     * @see #getSign()
     * @generated
     */
	void setSign(ClefSign value);

	/**
     * Returns the value of the '<em><b>Line</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' attribute.
     * @see #setLine(int)
     * @see org.ops4j.coro.model.score.ScorePackage#getClef_Line()
     * @model required="true"
     * @generated
     */
	int getLine();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Clef#getLine <em>Line</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line</em>' attribute.
     * @see #getLine()
     * @generated
     */
	void setLine(int value);

	/**
     * Returns the value of the '<em><b>Octave Change</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Octave Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Octave Change</em>' attribute.
     * @see #setOctaveChange(int)
     * @see org.ops4j.coro.model.score.ScorePackage#getClef_OctaveChange()
     * @model
     * @generated
     */
	int getOctaveChange();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Clef#getOctaveChange <em>Octave Change</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Octave Change</em>' attribute.
     * @see #getOctaveChange()
     * @generated
     */
	void setOctaveChange(int value);

} // Clef
