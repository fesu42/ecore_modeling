/**
 */
package de.whz.modeling.example.project.util;

import java.util.Calendar;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.whz.modeling.example.project.IIdentifiable;
import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.project.Participant;
import de.whz.modeling.example.project.ParticipantRole;
import de.whz.modeling.example.project.Person;
import de.whz.modeling.example.project.Project;
import de.whz.modeling.example.project.ProjectPackage;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see de.whz.modeling.example.project.ProjectPackage
 * @generated
 */
public class ProjectValidator extends EObjectValidator {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final ProjectValidator INSTANCE = new ProjectValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource()
	 * source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode()
	 * codes} from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.whz.modeling.example.project";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public ProjectValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ProjectPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case ProjectPackage.ORGANIZATION:
			return validateOrganization((Organization) value, diagnostics, context);
		case ProjectPackage.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		case ProjectPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case ProjectPackage.IIDENTIFIABLE:
			return validateIIdentifiable((IIdentifiable) value, diagnostics, context);
		case ProjectPackage.PARTICIPANT:
			return validateParticipant((Participant) value, diagnostics, context);
		case ProjectPackage.PARTICIPANT_ROLE:
			return validateParticipantRole((ParticipantRole) value, diagnostics, context);
		case ProjectPackage.INTEGER:
			return validateInteger((Integer) value, diagnostics, context);
		case ProjectPackage.LONG:
			return validateLong((Long) value, diagnostics, context);
		case ProjectPackage.FLOAT:
			return validateFloat((Float) value, diagnostics, context);
		case ProjectPackage.DOUBLE:
			return validateDouble((Double) value, diagnostics, context);
		case ProjectPackage.BYTE:
			return validateByte((Byte) value, diagnostics, context);
		case ProjectPackage.STRING:
			return validateString((String) value, diagnostics, context);
		case ProjectPackage.DATE:
			return validateDate((Calendar) value, diagnostics, context);
		case ProjectPackage.BOOLEAN:
			return validateBoolean((Boolean) value, diagnostics, context);
		case ProjectPackage.UUID:
			return validateUUID((String) value, diagnostics, context);
		case ProjectPackage.HOURS_PER_WEEK:
			return validateHoursPerWeek((Integer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePerson_validWorkload(person, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validWorkload constraint of '<em>Person</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePerson_validWorkload(Person person, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (person.getTotalWeeklyWorkload() > person.getWeeklyWorkload()) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "validWorkload", person.getName() }, new Object[] { person }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIIdentifiable(IIdentifiable iIdentifiable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iIdentifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateParticipant(Participant participant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateParticipantRole(ParticipantRole participantRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInteger(int integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLong(long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFloat(float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDouble(double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateByte(byte byte_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDate(Calendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBoolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUUID(String uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateHoursPerWeek(Integer hoursPerWeek, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this
		// validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // ProjectValidator
