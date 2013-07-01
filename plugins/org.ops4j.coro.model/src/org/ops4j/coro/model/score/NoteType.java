/**
 */
package org.ops4j.coro.model.score;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Note Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ops4j.coro.model.score.ScorePackage#getNoteType()
 * @model
 * @generated
 */
public enum NoteType implements Enumerator {
	/**
	 * The '<em><b>MAXIMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMA_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMA(0, "MAXIMA", ""),

	/**
	 * The '<em><b>LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(1, "LONG", "LONG"),

	/**
	 * The '<em><b>BREVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREVE_VALUE
	 * @generated
	 * @ordered
	 */
	BREVE(2, "BREVE", "BREVE"),

	/**
	 * The '<em><b>WHOLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	WHOLE(3, "WHOLE", "WHOLE"),

	/**
	 * The '<em><b>HALF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_VALUE
	 * @generated
	 * @ordered
	 */
	HALF(4, "HALF", "HALF"),

	/**
	 * The '<em><b>QUARTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER(5, "QUARTER", "QUARTER"),

	/**
	 * The '<em><b>EIGHTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTH_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHTH(6, "EIGHTH", "EIGHTH"),

	/**
	 * The '<em><b>N16TH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N16TH_VALUE
	 * @generated
	 * @ordered
	 */
	N16TH(7, "N16TH", "N16TH"),

	/**
	 * The '<em><b>N32ND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N32ND_VALUE
	 * @generated
	 * @ordered
	 */
	N32ND(8, "N32ND", "N32ND"),

	/**
	 * The '<em><b>N64TH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N64TH_VALUE
	 * @generated
	 * @ordered
	 */
	N64TH(9, "N64TH", "N64TH"),

	/**
	 * The '<em><b>N128TH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N128TH_VALUE
	 * @generated
	 * @ordered
	 */
	N128TH(10, "N128TH", "N128TH");

	/**
	 * The '<em><b>MAXIMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAXIMA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMA
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMA_VALUE = 0;

	/**
	 * The '<em><b>LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 1;

	/**
	 * The '<em><b>BREVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BREVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BREVE_VALUE = 2;

	/**
	 * The '<em><b>WHOLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHOLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHOLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHOLE_VALUE = 3;

	/**
	 * The '<em><b>HALF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALF_VALUE = 4;

	/**
	 * The '<em><b>QUARTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUARTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_VALUE = 5;

	/**
	 * The '<em><b>EIGHTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EIGHTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EIGHTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EIGHTH_VALUE = 6;

	/**
	 * The '<em><b>N16TH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N16TH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N16TH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N16TH_VALUE = 7;

	/**
	 * The '<em><b>N32ND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N32ND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N32ND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N32ND_VALUE = 8;

	/**
	 * The '<em><b>N64TH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N64TH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N64TH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N64TH_VALUE = 9;

	/**
	 * The '<em><b>N128TH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N128TH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N128TH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N128TH_VALUE = 10;

	/**
	 * An array of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoteType[] VALUES_ARRAY =
		new NoteType[] {
			MAXIMA,
			LONG,
			BREVE,
			WHOLE,
			HALF,
			QUARTER,
			EIGHTH,
			N16TH,
			N32ND,
			N64TH,
			N128TH,
		};

	/**
	 * A public read-only list of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoteType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoteType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoteType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoteType get(int value) {
		switch (value) {
			case MAXIMA_VALUE: return MAXIMA;
			case LONG_VALUE: return LONG;
			case BREVE_VALUE: return BREVE;
			case WHOLE_VALUE: return WHOLE;
			case HALF_VALUE: return HALF;
			case QUARTER_VALUE: return QUARTER;
			case EIGHTH_VALUE: return EIGHTH;
			case N16TH_VALUE: return N16TH;
			case N32ND_VALUE: return N32ND;
			case N64TH_VALUE: return N64TH;
			case N128TH_VALUE: return N128TH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NoteType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NoteType
