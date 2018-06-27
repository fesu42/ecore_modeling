/**
 */
package de.whz.modeling.example.project;

import java.util.UUID;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IIdentifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.IIdentifiable#getName <em>Name</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.IIdentifiable#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see de.whz.modeling.example.project.ProjectPackage#getIIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IIdentifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.whz.modeling.example.project.ProjectPackage#getIIdentifiable_Name()
	 * @model dataType="de.whz.modeling.example.project.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.IIdentifiable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(UUID)
	 * @see de.whz.modeling.example.project.ProjectPackage#getIIdentifiable_Uuid()
	 * @model id="true" dataType="de.whz.modeling.example.project.UUID" required="true" ordered="false"
	 * @generated
	 */
	UUID getUuid();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.IIdentifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(UUID value);

} // IIdentifiable
