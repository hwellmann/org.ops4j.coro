/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ops4j.coro.model.score.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScoreFactoryImpl extends EFactoryImpl implements ScoreFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ScoreFactory init() {
        try {
            ScoreFactory theScoreFactory = (ScoreFactory)EPackage.Registry.INSTANCE.getEFactory(ScorePackage.eNS_URI);
            if (theScoreFactory != null) {
                return theScoreFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScoreFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScoreFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ScorePackage.SCORE: return createScore();
            case ScorePackage.STAFF: return createStaff();
            case ScorePackage.PART: return createPart();
            case ScorePackage.STAFF_GROUP: return createStaffGroup();
            case ScorePackage.PART_LIST: return createPartList();
            case ScorePackage.MEASURE: return createMeasure();
            case ScorePackage.NOTE: return createNote();
            case ScorePackage.PITCH: return createPitch();
            case ScorePackage.KEY: return createKey();
            case ScorePackage.TIME: return createTime();
            case ScorePackage.CLEF: return createClef();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ScorePackage.STEP:
                return createStepFromString(eDataType, initialValue);
            case ScorePackage.NOTE_TYPE:
                return createNoteTypeFromString(eDataType, initialValue);
            case ScorePackage.ACCIDENTAL_TYPE:
                return createAccidentalTypeFromString(eDataType, initialValue);
            case ScorePackage.TIME_SYMBOL:
                return createTimeSymbolFromString(eDataType, initialValue);
            case ScorePackage.CLEF_SIGN:
                return createClefSignFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ScorePackage.STEP:
                return convertStepToString(eDataType, instanceValue);
            case ScorePackage.NOTE_TYPE:
                return convertNoteTypeToString(eDataType, instanceValue);
            case ScorePackage.ACCIDENTAL_TYPE:
                return convertAccidentalTypeToString(eDataType, instanceValue);
            case ScorePackage.TIME_SYMBOL:
                return convertTimeSymbolToString(eDataType, instanceValue);
            case ScorePackage.CLEF_SIGN:
                return convertClefSignToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Score createScore() {
        ScoreImpl score = new ScoreImpl();
        return score;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Staff createStaff() {
        StaffImpl staff = new StaffImpl();
        return staff;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Part createPart() {
        PartImpl part = new PartImpl();
        return part;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StaffGroup createStaffGroup() {
        StaffGroupImpl staffGroup = new StaffGroupImpl();
        return staffGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PartList createPartList() {
        PartListImpl partList = new PartListImpl();
        return partList;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Measure createMeasure() {
        MeasureImpl measure = new MeasureImpl();
        return measure;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Note createNote() {
        NoteImpl note = new NoteImpl();
        return note;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Pitch createPitch() {
        PitchImpl pitch = new PitchImpl();
        return pitch;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Key createKey() {
        KeyImpl key = new KeyImpl();
        return key;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Time createTime() {
        TimeImpl time = new TimeImpl();
        return time;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Clef createClef() {
        ClefImpl clef = new ClefImpl();
        return clef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Step createStepFromString(EDataType eDataType, String initialValue) {
        Step result = Step.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertStepToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NoteType createNoteTypeFromString(EDataType eDataType, String initialValue) {
        NoteType result = NoteType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertNoteTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AccidentalType createAccidentalTypeFromString(EDataType eDataType, String initialValue) {
        AccidentalType result = AccidentalType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertAccidentalTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TimeSymbol createTimeSymbolFromString(EDataType eDataType, String initialValue) {
        TimeSymbol result = TimeSymbol.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertTimeSymbolToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ClefSign createClefSignFromString(EDataType eDataType, String initialValue) {
        ClefSign result = ClefSign.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertClefSignToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScorePackage getScorePackage() {
        return (ScorePackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static ScorePackage getPackage() {
        return ScorePackage.eINSTANCE;
    }

} //ScoreFactoryImpl
