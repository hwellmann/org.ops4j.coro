/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Key#getFifths <em>Fifths</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Key#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject {
	/**
     * Returns the value of the '<em><b>Fifths</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fifths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fifths</em>' attribute.
     * @see #setFifths(int)
     * @see org.ops4j.coro.model.score.ScorePackage#getKey_Fifths()
     * @model
     * @generated
     */
	int getFifths();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Key#getFifths <em>Fifths</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fifths</em>' attribute.
     * @see #getFifths()
     * @generated
     */
	void setFifths(int value);

	/**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see #setMode(String)
     * @see org.ops4j.coro.model.score.ScorePackage#getKey_Mode()
     * @model
     * @generated
     */
	String getMode();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Key#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see #getMode()
     * @generated
     */
	void setMode(String value);

} // Key
