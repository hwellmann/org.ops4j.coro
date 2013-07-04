/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ops4j.coro.model.score.PartList#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ops4j.coro.model.score.ScorePackage#getPartList()
 * @model
 * @generated
 */
public interface PartList extends EObject {
	/**
     * Returns the value of the '<em><b>Parts</b></em>' reference list.
     * The list contents are of type {@link org.ops4j.coro.model.score.Part}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parts</em>' reference list.
     * @see org.ops4j.coro.model.score.ScorePackage#getPartList_Parts()
     * @model
     * @generated
     */
	EList<Part> getParts();

} // PartList
