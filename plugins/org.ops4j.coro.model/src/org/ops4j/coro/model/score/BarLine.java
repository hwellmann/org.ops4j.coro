/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.BarLine#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getBarLine()
 * @model
 * @generated
 */
public interface BarLine extends EObject {
    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * The literals are from the enumeration {@link org.ops4j.coro.model.score.Position}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see org.ops4j.coro.model.score.Position
     * @see #setPosition(Position)
     * @see org.ops4j.coro.model.score.ScorePackage#getBarLine_Position()
     * @model
     * @generated
     */
    Position getPosition();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.BarLine#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see org.ops4j.coro.model.score.Position
     * @see #getPosition()
     * @generated
     */
    void setPosition(Position value);

} // BarLine
