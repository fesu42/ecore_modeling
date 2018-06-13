/**
 */
package de.whz.modeling.example.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.Project#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Project#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see de.whz.modeling.example.project.ProjectPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends IIdentifiable {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Organization#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see de.whz.modeling.example.project.ProjectPackage#getProject_Organization()
	 * @see de.whz.modeling.example.project.Organization#getProjects
	 * @model opposite="projects" required="true" transient="false" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Project#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link de.whz.modeling.example.project.Participant}.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Participant#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see de.whz.modeling.example.project.ProjectPackage#getProject_Participant()
	 * @see de.whz.modeling.example.project.Participant#getProject
	 * @model opposite="project" containment="true" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	EList<Participant> getParticipant();

} // Project
