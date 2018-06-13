/**
 */
package de.whz.modeling.example.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.Organization#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Organization#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see de.whz.modeling.example.project.ProjectPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends IIdentifiable {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link de.whz.modeling.example.project.Project}.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Project#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see de.whz.modeling.example.project.ProjectPackage#getOrganization_Projects()
	 * @see de.whz.modeling.example.project.Project#getOrganization
	 * @model opposite="organization" containment="true" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link de.whz.modeling.example.project.Person}.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see de.whz.modeling.example.project.ProjectPackage#getOrganization_Employees()
	 * @see de.whz.modeling.example.project.Person#getOrganization
	 * @model opposite="organization" containment="true" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	EList<Person> getEmployees();

} // Organization
