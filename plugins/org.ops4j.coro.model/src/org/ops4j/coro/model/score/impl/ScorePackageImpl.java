/**
 */
package org.ops4j.coro.model.score.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ops4j.coro.model.score.AccidentalType;
import org.ops4j.coro.model.score.Clef;
import org.ops4j.coro.model.score.ClefSign;
import org.ops4j.coro.model.score.Key;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.PartList;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.Score;
import org.ops4j.coro.model.score.ScoreFactory;
import org.ops4j.coro.model.score.ScorePackage;
import org.ops4j.coro.model.score.Staff;
import org.ops4j.coro.model.score.StaffGroup;
import org.ops4j.coro.model.score.Step;
import org.ops4j.coro.model.score.Time;
import org.ops4j.coro.model.score.TimeSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScorePackageImpl extends EPackageImpl implements ScorePackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass scoreEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass staffEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass partEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass staffGroupEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass partListEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass measureEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass noteEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pitchEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass keyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass timeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass clefEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum stepEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum noteTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum accidentalTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum timeSymbolEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum clefSignEEnum = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.ops4j.coro.model.score.ScorePackage#eNS_URI
     * @see #init()
     * @generated
     */
	private ScorePackageImpl() {
        super(eNS_URI, ScoreFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ScorePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static ScorePackage init() {
        if (isInited) return (ScorePackage)EPackage.Registry.INSTANCE.getEPackage(ScorePackage.eNS_URI);

        // Obtain or create and register package
        ScorePackageImpl theScorePackage = (ScorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScorePackageImpl());

        isInited = true;

        // Create package meta-data objects
        theScorePackage.createPackageContents();

        // Initialize created meta-data
        theScorePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScorePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScorePackage.eNS_URI, theScorePackage);
        return theScorePackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getScore() {
        return scoreEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getScore_PartList() {
        return (EReference)scoreEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getScore_Parts() {
        return (EReference)scoreEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStaff() {
        return staffEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPart() {
        return partEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPart_Measures() {
        return (EReference)partEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPart_Score() {
        return (EReference)partEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStaffGroup() {
        return staffGroupEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPartList() {
        return partListEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPartList_Parts() {
        return (EReference)partListEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMeasure() {
        return measureEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMeasure_Notes() {
        return (EReference)measureEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMeasure_Key() {
        return (EReference)measureEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMeasure_Time() {
        return (EReference)measureEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMeasure_Clef() {
        return (EReference)measureEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMeasure_Part() {
        return (EReference)measureEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMeasure_Marker() {
        return (EAttribute)measureEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNote() {
        return noteEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getNote_Pitch() {
        return (EReference)noteEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNote_Duration() {
        return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNote_Type() {
        return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNote_Accidental() {
        return (EAttribute)noteEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getNote_Measure() {
        return (EReference)noteEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPitch() {
        return pitchEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPitch_Octave() {
        return (EAttribute)pitchEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPitch_Alteration() {
        return (EAttribute)pitchEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPitch_Step() {
        return (EAttribute)pitchEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKey() {
        return keyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKey_Fifths() {
        return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKey_Mode() {
        return (EAttribute)keyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTime() {
        return timeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTime_Numerator() {
        return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTime_Denominator() {
        return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getClef() {
        return clefEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getClef_Sign() {
        return (EAttribute)clefEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getClef_Line() {
        return (EAttribute)clefEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getClef_OctaveChange() {
        return (EAttribute)clefEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getStep() {
        return stepEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getNoteType() {
        return noteTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getAccidentalType() {
        return accidentalTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTimeSymbol() {
        return timeSymbolEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getClefSign() {
        return clefSignEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScoreFactory getScoreFactory() {
        return (ScoreFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        scoreEClass = createEClass(SCORE);
        createEReference(scoreEClass, SCORE__PART_LIST);
        createEReference(scoreEClass, SCORE__PARTS);

        staffEClass = createEClass(STAFF);

        partEClass = createEClass(PART);
        createEReference(partEClass, PART__MEASURES);
        createEReference(partEClass, PART__SCORE);

        staffGroupEClass = createEClass(STAFF_GROUP);

        partListEClass = createEClass(PART_LIST);
        createEReference(partListEClass, PART_LIST__PARTS);

        measureEClass = createEClass(MEASURE);
        createEReference(measureEClass, MEASURE__NOTES);
        createEReference(measureEClass, MEASURE__KEY);
        createEReference(measureEClass, MEASURE__TIME);
        createEReference(measureEClass, MEASURE__CLEF);
        createEReference(measureEClass, MEASURE__PART);
        createEAttribute(measureEClass, MEASURE__MARKER);

        noteEClass = createEClass(NOTE);
        createEReference(noteEClass, NOTE__PITCH);
        createEAttribute(noteEClass, NOTE__DURATION);
        createEAttribute(noteEClass, NOTE__TYPE);
        createEAttribute(noteEClass, NOTE__ACCIDENTAL);
        createEReference(noteEClass, NOTE__MEASURE);

        pitchEClass = createEClass(PITCH);
        createEAttribute(pitchEClass, PITCH__OCTAVE);
        createEAttribute(pitchEClass, PITCH__ALTERATION);
        createEAttribute(pitchEClass, PITCH__STEP);

        keyEClass = createEClass(KEY);
        createEAttribute(keyEClass, KEY__FIFTHS);
        createEAttribute(keyEClass, KEY__MODE);

        timeEClass = createEClass(TIME);
        createEAttribute(timeEClass, TIME__NUMERATOR);
        createEAttribute(timeEClass, TIME__DENOMINATOR);

        clefEClass = createEClass(CLEF);
        createEAttribute(clefEClass, CLEF__SIGN);
        createEAttribute(clefEClass, CLEF__LINE);
        createEAttribute(clefEClass, CLEF__OCTAVE_CHANGE);

        // Create enums
        stepEEnum = createEEnum(STEP);
        noteTypeEEnum = createEEnum(NOTE_TYPE);
        accidentalTypeEEnum = createEEnum(ACCIDENTAL_TYPE);
        timeSymbolEEnum = createEEnum(TIME_SYMBOL);
        clefSignEEnum = createEEnum(CLEF_SIGN);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(scoreEClass, Score.class, "Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScore_PartList(), this.getPartList(), null, "partList", null, 1, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScore_Parts(), this.getPart(), this.getPart_Score(), "parts", null, 0, -1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPart_Measures(), this.getMeasure(), this.getMeasure_Part(), "measures", null, 0, -1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPart_Score(), this.getScore(), this.getScore_Parts(), "score", null, 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staffGroupEClass, StaffGroup.class, "StaffGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(partListEClass, PartList.class, "PartList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPartList_Parts(), this.getPart(), null, "parts", null, 0, -1, PartList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMeasure_Notes(), this.getNote(), this.getNote_Measure(), "notes", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMeasure_Key(), this.getKey(), null, "key", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMeasure_Time(), this.getTime(), null, "time", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMeasure_Clef(), this.getClef(), null, "clef", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMeasure_Part(), this.getPart(), this.getPart_Measures(), "part", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMeasure_Marker(), ecorePackage.getEString(), "marker", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNote_Pitch(), this.getPitch(), null, "pitch", null, 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNote_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNote_Type(), this.getNoteType(), "type", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNote_Accidental(), this.getAccidentalType(), "accidental", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNote_Measure(), this.getMeasure(), this.getMeasure_Notes(), "measure", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pitchEClass, Pitch.class, "Pitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPitch_Octave(), ecorePackage.getEInt(), "octave", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPitch_Alteration(), ecorePackage.getEFloat(), "alteration", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPitch_Step(), this.getStep(), "step", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKey_Fifths(), ecorePackage.getEInt(), "fifths", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKey_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTime_Numerator(), ecorePackage.getEInt(), "numerator", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTime_Denominator(), ecorePackage.getEInt(), "denominator", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(clefEClass, Clef.class, "Clef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClef_Sign(), this.getClefSign(), "sign", null, 1, 1, Clef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClef_Line(), ecorePackage.getEInt(), "line", null, 1, 1, Clef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClef_OctaveChange(), ecorePackage.getEInt(), "octaveChange", null, 0, 1, Clef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(stepEEnum, Step.class, "Step");
        addEEnumLiteral(stepEEnum, Step.C);
        addEEnumLiteral(stepEEnum, Step.D);
        addEEnumLiteral(stepEEnum, Step.E);
        addEEnumLiteral(stepEEnum, Step.F);
        addEEnumLiteral(stepEEnum, Step.G);
        addEEnumLiteral(stepEEnum, Step.A);
        addEEnumLiteral(stepEEnum, Step.B);

        initEEnum(noteTypeEEnum, NoteType.class, "NoteType");
        addEEnumLiteral(noteTypeEEnum, NoteType.MAXIMA);
        addEEnumLiteral(noteTypeEEnum, NoteType.LONG);
        addEEnumLiteral(noteTypeEEnum, NoteType.BREVE);
        addEEnumLiteral(noteTypeEEnum, NoteType.WHOLE);
        addEEnumLiteral(noteTypeEEnum, NoteType.HALF);
        addEEnumLiteral(noteTypeEEnum, NoteType.QUARTER);
        addEEnumLiteral(noteTypeEEnum, NoteType.EIGHTH);
        addEEnumLiteral(noteTypeEEnum, NoteType.N16TH);
        addEEnumLiteral(noteTypeEEnum, NoteType.N32ND);
        addEEnumLiteral(noteTypeEEnum, NoteType.N64TH);
        addEEnumLiteral(noteTypeEEnum, NoteType.N128TH);

        initEEnum(accidentalTypeEEnum, AccidentalType.class, "AccidentalType");
        addEEnumLiteral(accidentalTypeEEnum, AccidentalType.NATURAL);
        addEEnumLiteral(accidentalTypeEEnum, AccidentalType.FLAT);
        addEEnumLiteral(accidentalTypeEEnum, AccidentalType.SHARP);

        initEEnum(timeSymbolEEnum, TimeSymbol.class, "TimeSymbol");
        addEEnumLiteral(timeSymbolEEnum, TimeSymbol.COMMON);
        addEEnumLiteral(timeSymbolEEnum, TimeSymbol.CUT);

        initEEnum(clefSignEEnum, ClefSign.class, "ClefSign");
        addEEnumLiteral(clefSignEEnum, ClefSign.C);
        addEEnumLiteral(clefSignEEnum, ClefSign.F);
        addEEnumLiteral(clefSignEEnum, ClefSign.G);

        // Create resource
        createResource(eNS_URI);
    }

} //ScorePackageImpl
