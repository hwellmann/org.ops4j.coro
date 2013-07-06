/**
 */
package org.ops4j.coro.model.score.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ops4j.coro.model.score.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ops4j.coro.model.score.ScorePackage
 * @generated
 */
public class ScoreSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ScorePackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScoreSwitch() {
        if (modelPackage == null) {
            modelPackage = ScorePackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ScorePackage.SCORE: {
                Score score = (Score)theEObject;
                T result = caseScore(score);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.STAFF: {
                Staff staff = (Staff)theEObject;
                T result = caseStaff(staff);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.PART: {
                Part part = (Part)theEObject;
                T result = casePart(part);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.STAFF_GROUP: {
                StaffGroup staffGroup = (StaffGroup)theEObject;
                T result = caseStaffGroup(staffGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.PART_LIST: {
                PartList partList = (PartList)theEObject;
                T result = casePartList(partList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.MEASURE: {
                Measure measure = (Measure)theEObject;
                T result = caseMeasure(measure);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.NOTE: {
                Note note = (Note)theEObject;
                T result = caseNote(note);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.PITCH: {
                Pitch pitch = (Pitch)theEObject;
                T result = casePitch(pitch);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.KEY: {
                Key key = (Key)theEObject;
                T result = caseKey(key);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.TIME: {
                Time time = (Time)theEObject;
                T result = caseTime(time);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.CLEF: {
                Clef clef = (Clef)theEObject;
                T result = caseClef(clef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScorePackage.REST: {
                Rest rest = (Rest)theEObject;
                T result = caseRest(rest);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Score</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Score</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseScore(Score object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStaff(Staff object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePart(Part object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Staff Group</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Staff Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStaffGroup(StaffGroup object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Part List</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Part List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePartList(PartList object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMeasure(Measure object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Note</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNote(Note object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Pitch</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pitch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePitch(Pitch object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKey(Key object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTime(Time object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Clef</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clef</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseClef(Clef object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Rest</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rest</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRest(Rest object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
	public T defaultCase(EObject object) {
        return null;
    }

} //ScoreSwitch
