/**
 */
package org.ops4j.coro.model.score;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Accidental Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ops4j.coro.model.score.ScorePackage#getAccidentalType()
 * @model
 * @generated
 */
public enum AccidentalType implements Enumerator {
	/**
     * The '<em><b>NATURAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NATURAL_VALUE
     * @generated
     * @ordered
     */
	NATURAL(0, "NATURAL", "NATURAL"),

	/**
     * The '<em><b>FLAT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FLAT_VALUE
     * @generated
     * @ordered
     */
	FLAT(1, "FLAT", "FLAT"),

	/**
     * The '<em><b>SHARP</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SHARP_VALUE
     * @generated
     * @ordered
     */
	SHARP(2, "SHARP", "SHARP");

	/**
     * The '<em><b>NATURAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATURAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NATURAL
     * @model
     * @generated
     * @ordered
     */
	public static final int NATURAL_VALUE = 0;

	/**
     * The '<em><b>FLAT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FLAT
     * @model
     * @generated
     * @ordered
     */
	public static final int FLAT_VALUE = 1;

	/**
     * The '<em><b>SHARP</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHARP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SHARP
     * @model
     * @generated
     * @ordered
     */
	public static final int SHARP_VALUE = 2;

	/**
     * An array of all the '<em><b>Accidental Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final AccidentalType[] VALUES_ARRAY =
		new AccidentalType[] {
            NATURAL,
            FLAT,
            SHARP,
        };

	/**
     * A public read-only list of all the '<em><b>Accidental Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<AccidentalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Accidental Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static AccidentalType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccidentalType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Accidental Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static AccidentalType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AccidentalType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Accidental Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static AccidentalType get(int value) {
        switch (value) {
            case NATURAL_VALUE: return NATURAL;
            case FLAT_VALUE: return FLAT;
            case SHARP_VALUE: return SHARP;
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
	private AccidentalType(int value, String name, String literal) {
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
	
} //AccidentalType
