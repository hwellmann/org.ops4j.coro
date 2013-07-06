/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.Rest#isMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getRest()
 * @model
 * @generated
 */
public interface Rest extends EObject {
    /**
     * Returns the value of the '<em><b>Measure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure</em>' attribute.
     * @see #setMeasure(boolean)
     * @see org.ops4j.coro.model.score.ScorePackage#getRest_Measure()
     * @model
     * @generated
     */
    boolean isMeasure();

    /**
     * Sets the value of the '{@link org.ops4j.coro.model.score.Rest#isMeasure <em>Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measure</em>' attribute.
     * @see #isMeasure()
     * @generated
     */
    void setMeasure(boolean value);

} // Rest
