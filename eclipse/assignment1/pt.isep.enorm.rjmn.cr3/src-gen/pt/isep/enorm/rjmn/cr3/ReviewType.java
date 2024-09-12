/**
 */
package pt.isep.enorm.rjmn.cr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Review Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.rjmn.cr3.Cr3Package#getReviewType()
 * @model
 * @generated
 */
public enum ReviewType implements Enumerator {
	/**
	 * The '<em><b>ONLYGRADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLYGRADE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLYGRADE(0, "ONLYGRADE", "ONLYGRADE"),

	/**
	 * The '<em><b>ANNOTATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATED_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATED(1, "ANNOTATED", "ANNOTATED");

	/**
	 * The '<em><b>ONLYGRADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLYGRADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONLYGRADE_VALUE = 0;

	/**
	 * The '<em><b>ANNOTATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Review Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReviewType[] VALUES_ARRAY = new ReviewType[] { ONLYGRADE, ANNOTATED, };

	/**
	 * A public read-only list of all the '<em><b>Review Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReviewType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Review Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReviewType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReviewType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Review Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReviewType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReviewType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Review Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReviewType get(int value) {
		switch (value) {
		case ONLYGRADE_VALUE:
			return ONLYGRADE;
		case ANNOTATED_VALUE:
			return ANNOTATED;
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
	private ReviewType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //ReviewType
