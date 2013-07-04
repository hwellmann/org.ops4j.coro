/**
 */
package org.ops4j.coro.model.score.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ops4j.coro.model.score.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ops4j.coro.model.score.ScorePackage
 * @generated
 */
public class ScoreAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ScorePackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScoreAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ScorePackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ScoreSwitch<Adapter> modelSwitch =
		new ScoreSwitch<Adapter>() {
            @Override
            public Adapter caseScore(Score object) {
                return createScoreAdapter();
            }
            @Override
            public Adapter caseStaff(Staff object) {
                return createStaffAdapter();
            }
            @Override
            public Adapter casePart(Part object) {
                return createPartAdapter();
            }
            @Override
            public Adapter caseStaffGroup(StaffGroup object) {
                return createStaffGroupAdapter();
            }
            @Override
            public Adapter casePartList(PartList object) {
                return createPartListAdapter();
            }
            @Override
            public Adapter caseMeasure(Measure object) {
                return createMeasureAdapter();
            }
            @Override
            public Adapter caseNote(Note object) {
                return createNoteAdapter();
            }
            @Override
            public Adapter casePitch(Pitch object) {
                return createPitchAdapter();
            }
            @Override
            public Adapter caseKey(Key object) {
                return createKeyAdapter();
            }
            @Override
            public Adapter caseTime(Time object) {
                return createTimeAdapter();
            }
            @Override
            public Adapter caseClef(Clef object) {
                return createClefAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Score <em>Score</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Score
     * @generated
     */
	public Adapter createScoreAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Staff <em>Staff</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Staff
     * @generated
     */
	public Adapter createStaffAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Part <em>Part</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Part
     * @generated
     */
	public Adapter createPartAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.StaffGroup <em>Staff Group</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.StaffGroup
     * @generated
     */
	public Adapter createStaffGroupAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.PartList <em>Part List</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.PartList
     * @generated
     */
	public Adapter createPartListAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Measure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Measure
     * @generated
     */
	public Adapter createMeasureAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Note <em>Note</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Note
     * @generated
     */
	public Adapter createNoteAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Pitch <em>Pitch</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Pitch
     * @generated
     */
	public Adapter createPitchAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Key <em>Key</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Key
     * @generated
     */
	public Adapter createKeyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Time <em>Time</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Time
     * @generated
     */
	public Adapter createTimeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.ops4j.coro.model.score.Clef <em>Clef</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ops4j.coro.model.score.Clef
     * @generated
     */
	public Adapter createClefAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //ScoreAdapterFactory
