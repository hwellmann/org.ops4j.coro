/**
 */
package org.ops4j.coro.model.score;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ops4j.coro.model.score.ScoreFactory
 * @model kind="package"
 * @generated
 */
public interface ScorePackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "score";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:org.ops4j.coro:score";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "coro";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ScorePackage eINSTANCE = org.ops4j.coro.model.score.impl.ScorePackageImpl.init();

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.ScoreImpl <em>Score</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.ScoreImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getScore()
     * @generated
     */
	int SCORE = 0;

	/**
     * The feature id for the '<em><b>Part List</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCORE__PART_LIST = 0;

	/**
     * The feature id for the '<em><b>Parts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCORE__PARTS = 1;

	/**
     * The number of structural features of the '<em>Score</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCORE_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Score</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCORE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.StaffImpl <em>Staff</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.StaffImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getStaff()
     * @generated
     */
	int STAFF = 1;

	/**
     * The number of structural features of the '<em>Staff</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STAFF_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>Staff</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STAFF_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.PartImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getPart()
     * @generated
     */
	int PART = 2;

	/**
     * The feature id for the '<em><b>Measures</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART__MEASURES = 0;

	/**
     * The feature id for the '<em><b>Score</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART__SCORE = 1;

	/**
     * The number of structural features of the '<em>Part</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Part</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.StaffGroupImpl <em>Staff Group</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.StaffGroupImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getStaffGroup()
     * @generated
     */
	int STAFF_GROUP = 3;

	/**
     * The number of structural features of the '<em>Staff Group</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STAFF_GROUP_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>Staff Group</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STAFF_GROUP_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.PartListImpl <em>Part List</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.PartListImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getPartList()
     * @generated
     */
	int PART_LIST = 4;

	/**
     * The feature id for the '<em><b>Parts</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART_LIST__PARTS = 0;

	/**
     * The number of structural features of the '<em>Part List</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART_LIST_FEATURE_COUNT = 1;

	/**
     * The number of operations of the '<em>Part List</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PART_LIST_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.MeasureImpl <em>Measure</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.MeasureImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getMeasure()
     * @generated
     */
	int MEASURE = 5;

	/**
     * The feature id for the '<em><b>Notes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE__NOTES = 0;

	/**
     * The feature id for the '<em><b>Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE__KEY = 1;

	/**
     * The feature id for the '<em><b>Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE__TIME = 2;

	/**
     * The feature id for the '<em><b>Clef</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE__CLEF = 3;

	/**
     * The feature id for the '<em><b>Part</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE__PART = 4;

	/**
     * The feature id for the '<em><b>Marker</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__MARKER = 5;

    /**
     * The number of structural features of the '<em>Measure</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE_FEATURE_COUNT = 6;

	/**
     * The number of operations of the '<em>Measure</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEASURE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.NoteImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getNote()
     * @generated
     */
	int NOTE = 6;

	/**
     * The feature id for the '<em><b>Pitch</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE__PITCH = 0;

	/**
     * The feature id for the '<em><b>Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE__DURATION = 1;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE__TYPE = 2;

	/**
     * The feature id for the '<em><b>Accidental</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE__ACCIDENTAL = 3;

	/**
     * The feature id for the '<em><b>Measure</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE__MEASURE = 4;

	/**
     * The feature id for the '<em><b>Rest</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE__REST = 5;

    /**
     * The feature id for the '<em><b>Dots</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE__DOTS = 6;

    /**
     * The number of structural features of the '<em>Note</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE_FEATURE_COUNT = 7;

	/**
     * The number of operations of the '<em>Note</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NOTE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.PitchImpl <em>Pitch</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.PitchImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getPitch()
     * @generated
     */
	int PITCH = 7;

	/**
     * The feature id for the '<em><b>Octave</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PITCH__OCTAVE = 0;

	/**
     * The feature id for the '<em><b>Alteration</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PITCH__ALTERATION = 1;

	/**
     * The feature id for the '<em><b>Step</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PITCH__STEP = 2;

	/**
     * The number of structural features of the '<em>Pitch</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PITCH_FEATURE_COUNT = 3;

	/**
     * The number of operations of the '<em>Pitch</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PITCH_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.KeyImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getKey()
     * @generated
     */
	int KEY = 8;

	/**
     * The feature id for the '<em><b>Fifths</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KEY__FIFTHS = 0;

	/**
     * The feature id for the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KEY__MODE = 1;

	/**
     * The number of structural features of the '<em>Key</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KEY_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Key</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KEY_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.TimeImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getTime()
     * @generated
     */
	int TIME = 9;

	/**
     * The feature id for the '<em><b>Numerator</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TIME__NUMERATOR = 0;

	/**
     * The feature id for the '<em><b>Denominator</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TIME__DENOMINATOR = 1;

	/**
     * The number of structural features of the '<em>Time</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TIME_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Time</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TIME_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.ClefImpl <em>Clef</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.ClefImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getClef()
     * @generated
     */
	int CLEF = 10;

	/**
     * The feature id for the '<em><b>Sign</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLEF__SIGN = 0;

	/**
     * The feature id for the '<em><b>Line</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLEF__LINE = 1;

	/**
     * The feature id for the '<em><b>Octave Change</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLEF__OCTAVE_CHANGE = 2;

	/**
     * The number of structural features of the '<em>Clef</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLEF_FEATURE_COUNT = 3;

	/**
     * The number of operations of the '<em>Clef</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLEF_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.impl.RestImpl <em>Rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.impl.RestImpl
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getRest()
     * @generated
     */
    int REST = 11;

    /**
     * The feature id for the '<em><b>Measure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REST__MEASURE = 0;

    /**
     * The number of structural features of the '<em>Rest</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REST_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Rest</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REST_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.ops4j.coro.model.score.Step <em>Step</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.Step
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getStep()
     * @generated
     */
	int STEP = 12;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.NoteType <em>Note Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.NoteType
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getNoteType()
     * @generated
     */
	int NOTE_TYPE = 13;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.AccidentalType <em>Accidental Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.AccidentalType
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getAccidentalType()
     * @generated
     */
	int ACCIDENTAL_TYPE = 14;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.TimeSymbol <em>Time Symbol</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.TimeSymbol
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getTimeSymbol()
     * @generated
     */
	int TIME_SYMBOL = 15;

	/**
     * The meta object id for the '{@link org.ops4j.coro.model.score.ClefSign <em>Clef Sign</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.ops4j.coro.model.score.ClefSign
     * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getClefSign()
     * @generated
     */
	int CLEF_SIGN = 16;


	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Score <em>Score</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Score</em>'.
     * @see org.ops4j.coro.model.score.Score
     * @generated
     */
	EClass getScore();

	/**
     * Returns the meta object for the containment reference '{@link org.ops4j.coro.model.score.Score#getPartList <em>Part List</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Part List</em>'.
     * @see org.ops4j.coro.model.score.Score#getPartList()
     * @see #getScore()
     * @generated
     */
	EReference getScore_PartList();

	/**
     * Returns the meta object for the containment reference list '{@link org.ops4j.coro.model.score.Score#getParts <em>Parts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parts</em>'.
     * @see org.ops4j.coro.model.score.Score#getParts()
     * @see #getScore()
     * @generated
     */
	EReference getScore_Parts();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Staff <em>Staff</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Staff</em>'.
     * @see org.ops4j.coro.model.score.Staff
     * @generated
     */
	EClass getStaff();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Part <em>Part</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Part</em>'.
     * @see org.ops4j.coro.model.score.Part
     * @generated
     */
	EClass getPart();

	/**
     * Returns the meta object for the containment reference list '{@link org.ops4j.coro.model.score.Part#getMeasures <em>Measures</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Measures</em>'.
     * @see org.ops4j.coro.model.score.Part#getMeasures()
     * @see #getPart()
     * @generated
     */
	EReference getPart_Measures();

	/**
     * Returns the meta object for the container reference '{@link org.ops4j.coro.model.score.Part#getScore <em>Score</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Score</em>'.
     * @see org.ops4j.coro.model.score.Part#getScore()
     * @see #getPart()
     * @generated
     */
	EReference getPart_Score();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.StaffGroup <em>Staff Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Staff Group</em>'.
     * @see org.ops4j.coro.model.score.StaffGroup
     * @generated
     */
	EClass getStaffGroup();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.PartList <em>Part List</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Part List</em>'.
     * @see org.ops4j.coro.model.score.PartList
     * @generated
     */
	EClass getPartList();

	/**
     * Returns the meta object for the reference list '{@link org.ops4j.coro.model.score.PartList#getParts <em>Parts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Parts</em>'.
     * @see org.ops4j.coro.model.score.PartList#getParts()
     * @see #getPartList()
     * @generated
     */
	EReference getPartList_Parts();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Measure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measure</em>'.
     * @see org.ops4j.coro.model.score.Measure
     * @generated
     */
	EClass getMeasure();

	/**
     * Returns the meta object for the containment reference list '{@link org.ops4j.coro.model.score.Measure#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Notes</em>'.
     * @see org.ops4j.coro.model.score.Measure#getNotes()
     * @see #getMeasure()
     * @generated
     */
	EReference getMeasure_Notes();

	/**
     * Returns the meta object for the containment reference '{@link org.ops4j.coro.model.score.Measure#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Key</em>'.
     * @see org.ops4j.coro.model.score.Measure#getKey()
     * @see #getMeasure()
     * @generated
     */
	EReference getMeasure_Key();

	/**
     * Returns the meta object for the containment reference '{@link org.ops4j.coro.model.score.Measure#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time</em>'.
     * @see org.ops4j.coro.model.score.Measure#getTime()
     * @see #getMeasure()
     * @generated
     */
	EReference getMeasure_Time();

	/**
     * Returns the meta object for the containment reference '{@link org.ops4j.coro.model.score.Measure#getClef <em>Clef</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Clef</em>'.
     * @see org.ops4j.coro.model.score.Measure#getClef()
     * @see #getMeasure()
     * @generated
     */
	EReference getMeasure_Clef();

	/**
     * Returns the meta object for the container reference '{@link org.ops4j.coro.model.score.Measure#getPart <em>Part</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Part</em>'.
     * @see org.ops4j.coro.model.score.Measure#getPart()
     * @see #getMeasure()
     * @generated
     */
	EReference getMeasure_Part();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Measure#getMarker <em>Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Marker</em>'.
     * @see org.ops4j.coro.model.score.Measure#getMarker()
     * @see #getMeasure()
     * @generated
     */
    EAttribute getMeasure_Marker();

    /**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Note <em>Note</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Note</em>'.
     * @see org.ops4j.coro.model.score.Note
     * @generated
     */
	EClass getNote();

	/**
     * Returns the meta object for the reference '{@link org.ops4j.coro.model.score.Note#getPitch <em>Pitch</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pitch</em>'.
     * @see org.ops4j.coro.model.score.Note#getPitch()
     * @see #getNote()
     * @generated
     */
	EReference getNote_Pitch();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Note#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Duration</em>'.
     * @see org.ops4j.coro.model.score.Note#getDuration()
     * @see #getNote()
     * @generated
     */
	EAttribute getNote_Duration();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Note#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.ops4j.coro.model.score.Note#getType()
     * @see #getNote()
     * @generated
     */
	EAttribute getNote_Type();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Note#getAccidental <em>Accidental</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Accidental</em>'.
     * @see org.ops4j.coro.model.score.Note#getAccidental()
     * @see #getNote()
     * @generated
     */
	EAttribute getNote_Accidental();

	/**
     * Returns the meta object for the container reference '{@link org.ops4j.coro.model.score.Note#getMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Measure</em>'.
     * @see org.ops4j.coro.model.score.Note#getMeasure()
     * @see #getNote()
     * @generated
     */
	EReference getNote_Measure();

	/**
     * Returns the meta object for the reference '{@link org.ops4j.coro.model.score.Note#getRest <em>Rest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Rest</em>'.
     * @see org.ops4j.coro.model.score.Note#getRest()
     * @see #getNote()
     * @generated
     */
    EReference getNote_Rest();

    /**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Note#getDots <em>Dots</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dots</em>'.
     * @see org.ops4j.coro.model.score.Note#getDots()
     * @see #getNote()
     * @generated
     */
    EAttribute getNote_Dots();

    /**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Pitch <em>Pitch</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pitch</em>'.
     * @see org.ops4j.coro.model.score.Pitch
     * @generated
     */
	EClass getPitch();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Pitch#getOctave <em>Octave</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Octave</em>'.
     * @see org.ops4j.coro.model.score.Pitch#getOctave()
     * @see #getPitch()
     * @generated
     */
	EAttribute getPitch_Octave();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Pitch#getAlteration <em>Alteration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alteration</em>'.
     * @see org.ops4j.coro.model.score.Pitch#getAlteration()
     * @see #getPitch()
     * @generated
     */
	EAttribute getPitch_Alteration();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Pitch#getStep <em>Step</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Step</em>'.
     * @see org.ops4j.coro.model.score.Pitch#getStep()
     * @see #getPitch()
     * @generated
     */
	EAttribute getPitch_Step();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Key <em>Key</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Key</em>'.
     * @see org.ops4j.coro.model.score.Key
     * @generated
     */
	EClass getKey();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Key#getFifths <em>Fifths</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fifths</em>'.
     * @see org.ops4j.coro.model.score.Key#getFifths()
     * @see #getKey()
     * @generated
     */
	EAttribute getKey_Fifths();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Key#getMode <em>Mode</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mode</em>'.
     * @see org.ops4j.coro.model.score.Key#getMode()
     * @see #getKey()
     * @generated
     */
	EAttribute getKey_Mode();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Time <em>Time</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time</em>'.
     * @see org.ops4j.coro.model.score.Time
     * @generated
     */
	EClass getTime();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Time#getNumerator <em>Numerator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numerator</em>'.
     * @see org.ops4j.coro.model.score.Time#getNumerator()
     * @see #getTime()
     * @generated
     */
	EAttribute getTime_Numerator();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Time#getDenominator <em>Denominator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Denominator</em>'.
     * @see org.ops4j.coro.model.score.Time#getDenominator()
     * @see #getTime()
     * @generated
     */
	EAttribute getTime_Denominator();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Clef <em>Clef</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Clef</em>'.
     * @see org.ops4j.coro.model.score.Clef
     * @generated
     */
	EClass getClef();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Clef#getSign <em>Sign</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sign</em>'.
     * @see org.ops4j.coro.model.score.Clef#getSign()
     * @see #getClef()
     * @generated
     */
	EAttribute getClef_Sign();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Clef#getLine <em>Line</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line</em>'.
     * @see org.ops4j.coro.model.score.Clef#getLine()
     * @see #getClef()
     * @generated
     */
	EAttribute getClef_Line();

	/**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Clef#getOctaveChange <em>Octave Change</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Octave Change</em>'.
     * @see org.ops4j.coro.model.score.Clef#getOctaveChange()
     * @see #getClef()
     * @generated
     */
	EAttribute getClef_OctaveChange();

	/**
     * Returns the meta object for class '{@link org.ops4j.coro.model.score.Rest <em>Rest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rest</em>'.
     * @see org.ops4j.coro.model.score.Rest
     * @generated
     */
    EClass getRest();

    /**
     * Returns the meta object for the attribute '{@link org.ops4j.coro.model.score.Rest#isMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Measure</em>'.
     * @see org.ops4j.coro.model.score.Rest#isMeasure()
     * @see #getRest()
     * @generated
     */
    EAttribute getRest_Measure();

    /**
     * Returns the meta object for enum '{@link org.ops4j.coro.model.score.Step <em>Step</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Step</em>'.
     * @see org.ops4j.coro.model.score.Step
     * @generated
     */
	EEnum getStep();

	/**
     * Returns the meta object for enum '{@link org.ops4j.coro.model.score.NoteType <em>Note Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Note Type</em>'.
     * @see org.ops4j.coro.model.score.NoteType
     * @generated
     */
	EEnum getNoteType();

	/**
     * Returns the meta object for enum '{@link org.ops4j.coro.model.score.AccidentalType <em>Accidental Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Accidental Type</em>'.
     * @see org.ops4j.coro.model.score.AccidentalType
     * @generated
     */
	EEnum getAccidentalType();

	/**
     * Returns the meta object for enum '{@link org.ops4j.coro.model.score.TimeSymbol <em>Time Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Symbol</em>'.
     * @see org.ops4j.coro.model.score.TimeSymbol
     * @generated
     */
	EEnum getTimeSymbol();

	/**
     * Returns the meta object for enum '{@link org.ops4j.coro.model.score.ClefSign <em>Clef Sign</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Clef Sign</em>'.
     * @see org.ops4j.coro.model.score.ClefSign
     * @generated
     */
	EEnum getClefSign();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	ScoreFactory getScoreFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.ScoreImpl <em>Score</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.ScoreImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getScore()
         * @generated
         */
		EClass SCORE = eINSTANCE.getScore();

		/**
         * The meta object literal for the '<em><b>Part List</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SCORE__PART_LIST = eINSTANCE.getScore_PartList();

		/**
         * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SCORE__PARTS = eINSTANCE.getScore_Parts();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.StaffImpl <em>Staff</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.StaffImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getStaff()
         * @generated
         */
		EClass STAFF = eINSTANCE.getStaff();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.PartImpl <em>Part</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.PartImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getPart()
         * @generated
         */
		EClass PART = eINSTANCE.getPart();

		/**
         * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PART__MEASURES = eINSTANCE.getPart_Measures();

		/**
         * The meta object literal for the '<em><b>Score</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PART__SCORE = eINSTANCE.getPart_Score();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.StaffGroupImpl <em>Staff Group</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.StaffGroupImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getStaffGroup()
         * @generated
         */
		EClass STAFF_GROUP = eINSTANCE.getStaffGroup();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.PartListImpl <em>Part List</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.PartListImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getPartList()
         * @generated
         */
		EClass PART_LIST = eINSTANCE.getPartList();

		/**
         * The meta object literal for the '<em><b>Parts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PART_LIST__PARTS = eINSTANCE.getPartList_Parts();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.MeasureImpl <em>Measure</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.MeasureImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getMeasure()
         * @generated
         */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
         * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MEASURE__NOTES = eINSTANCE.getMeasure_Notes();

		/**
         * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MEASURE__KEY = eINSTANCE.getMeasure_Key();

		/**
         * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MEASURE__TIME = eINSTANCE.getMeasure_Time();

		/**
         * The meta object literal for the '<em><b>Clef</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MEASURE__CLEF = eINSTANCE.getMeasure_Clef();

		/**
         * The meta object literal for the '<em><b>Part</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MEASURE__PART = eINSTANCE.getMeasure_Part();

		/**
         * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEASURE__MARKER = eINSTANCE.getMeasure_Marker();

        /**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.NoteImpl <em>Note</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.NoteImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getNote()
         * @generated
         */
		EClass NOTE = eINSTANCE.getNote();

		/**
         * The meta object literal for the '<em><b>Pitch</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NOTE__PITCH = eINSTANCE.getNote_Pitch();

		/**
         * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NOTE__DURATION = eINSTANCE.getNote_Duration();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NOTE__TYPE = eINSTANCE.getNote_Type();

		/**
         * The meta object literal for the '<em><b>Accidental</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NOTE__ACCIDENTAL = eINSTANCE.getNote_Accidental();

		/**
         * The meta object literal for the '<em><b>Measure</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NOTE__MEASURE = eINSTANCE.getNote_Measure();

		/**
         * The meta object literal for the '<em><b>Rest</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NOTE__REST = eINSTANCE.getNote_Rest();

        /**
         * The meta object literal for the '<em><b>Dots</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE__DOTS = eINSTANCE.getNote_Dots();

        /**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.PitchImpl <em>Pitch</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.PitchImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getPitch()
         * @generated
         */
		EClass PITCH = eINSTANCE.getPitch();

		/**
         * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PITCH__OCTAVE = eINSTANCE.getPitch_Octave();

		/**
         * The meta object literal for the '<em><b>Alteration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PITCH__ALTERATION = eINSTANCE.getPitch_Alteration();

		/**
         * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PITCH__STEP = eINSTANCE.getPitch_Step();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.KeyImpl <em>Key</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.KeyImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getKey()
         * @generated
         */
		EClass KEY = eINSTANCE.getKey();

		/**
         * The meta object literal for the '<em><b>Fifths</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KEY__FIFTHS = eINSTANCE.getKey_Fifths();

		/**
         * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KEY__MODE = eINSTANCE.getKey_Mode();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.TimeImpl <em>Time</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.TimeImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getTime()
         * @generated
         */
		EClass TIME = eINSTANCE.getTime();

		/**
         * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TIME__NUMERATOR = eINSTANCE.getTime_Numerator();

		/**
         * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TIME__DENOMINATOR = eINSTANCE.getTime_Denominator();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.ClefImpl <em>Clef</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.ClefImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getClef()
         * @generated
         */
		EClass CLEF = eINSTANCE.getClef();

		/**
         * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CLEF__SIGN = eINSTANCE.getClef_Sign();

		/**
         * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CLEF__LINE = eINSTANCE.getClef_Line();

		/**
         * The meta object literal for the '<em><b>Octave Change</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CLEF__OCTAVE_CHANGE = eINSTANCE.getClef_OctaveChange();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.impl.RestImpl <em>Rest</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.impl.RestImpl
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getRest()
         * @generated
         */
        EClass REST = eINSTANCE.getRest();

        /**
         * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REST__MEASURE = eINSTANCE.getRest_Measure();

        /**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.Step <em>Step</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.Step
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getStep()
         * @generated
         */
		EEnum STEP = eINSTANCE.getStep();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.NoteType <em>Note Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.NoteType
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getNoteType()
         * @generated
         */
		EEnum NOTE_TYPE = eINSTANCE.getNoteType();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.AccidentalType <em>Accidental Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.AccidentalType
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getAccidentalType()
         * @generated
         */
		EEnum ACCIDENTAL_TYPE = eINSTANCE.getAccidentalType();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.TimeSymbol <em>Time Symbol</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.TimeSymbol
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getTimeSymbol()
         * @generated
         */
		EEnum TIME_SYMBOL = eINSTANCE.getTimeSymbol();

		/**
         * The meta object literal for the '{@link org.ops4j.coro.model.score.ClefSign <em>Clef Sign</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.ops4j.coro.model.score.ClefSign
         * @see org.ops4j.coro.model.score.impl.ScorePackageImpl#getClefSign()
         * @generated
         */
		EEnum CLEF_SIGN = eINSTANCE.getClefSign();

	}

} //ScorePackage
