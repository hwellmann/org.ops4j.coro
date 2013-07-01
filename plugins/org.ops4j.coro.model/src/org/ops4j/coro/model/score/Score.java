/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Score#getPartList <em>Part List</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Score#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getScore()
 * @model
 * @generated
 */
public interface Score extends EObject {
	/**
	 * Returns the value of the '<em><b>Part List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part List</em>' containment reference.
	 * @see #setPartList(PartList)
	 * @see org.ops4j.coro.model.score.ScorePackage#getScore_PartList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PartList getPartList();

	/**
	 * Sets the value of the '{@link org.ops4j.coro.model.score.Score#getPartList <em>Part List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part List</em>' containment reference.
	 * @see #getPartList()
	 * @generated
	 */
	void setPartList(PartList value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.ops4j.coro.model.score.Part}.
	 * It is bidirectional and its opposite is '{@link org.ops4j.coro.model.score.Part#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.ops4j.coro.model.score.ScorePackage#getScore_Parts()
	 * @see org.ops4j.coro.model.score.Part#getScore
	 * @model opposite="score" containment="true"
	 * @generated
	 */
	EList<Part> getParts();

} // Score
