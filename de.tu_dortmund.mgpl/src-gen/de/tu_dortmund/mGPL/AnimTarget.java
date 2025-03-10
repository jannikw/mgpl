/**
 * generated by Xtext 2.20.0
 */
package de.tu_dortmund.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anim Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_dortmund.mGPL.AnimTarget#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.tu_dortmund.mGPL.MGPLPackage#getAnimTarget()
 * @model
 * @generated
 */
public interface AnimTarget extends ReferenceTarget
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.tu_dortmund.mGPL.ObjType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.tu_dortmund.mGPL.ObjType
   * @see #setType(ObjType)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getAnimTarget_Type()
   * @model
   * @generated
   */
  ObjType getType();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.AnimTarget#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.tu_dortmund.mGPL.ObjType
   * @see #getType()
   * @generated
   */
  void setType(ObjType value);

} // AnimTarget
