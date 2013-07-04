/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Part#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.ops4j.coro.model.score.Part#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
	/**
     * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
     * The list contents are of type {@link org.ops4j.coro.model.score.Measure}.
     * It is bidirectional and its opposite is '{@link org.ops4j.coro.model.score.Measure#getPart <em>Part</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Measures</em>' containment reference list.
     * @see org.ops4j.coro.model.score.ScorePackage#getPart_Measures()
     * @see org.ops4j.coro.model.score.Measure#getPart
     * @model opposite="part" containment="true"
     * @generated
     */
	EList<Measure> getMeasures();

	/**
     * Returns the value of the '<em><b>Score</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.ops4j.coro.model.score.Score#getParts <em>Parts</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Score</em>' container reference.
     * @see #setScore(Score)
     * @see org.ops4j.coro.model.score.ScorePackage#getPart_Score()
     * @see org.ops4j.coro.model.score.Score#getParts
     * @model opposite="parts" required="true" transient="false"
     * @generated
     */
	Score getScore();

	/**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Part#getScore <em>Score</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Score</em>' container reference.
     * @see #getScore()
     * @generated
     */
	void setScore(Score value);

} // Part
