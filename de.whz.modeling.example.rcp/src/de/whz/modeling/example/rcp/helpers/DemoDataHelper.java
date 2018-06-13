package de.whz.modeling.example.rcp.helpers;

import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;

import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.project.Participant;
import de.whz.modeling.example.project.ParticipantRole;
import de.whz.modeling.example.project.Person;
import de.whz.modeling.example.project.Project;
import de.whz.modeling.example.project.ProjectFactory;

public enum DemoDataHelper {

	INSTANCE;

	public Organization createRootOrganization(Resource container) {
		// create a new organization object via the provided factory
		Organization organization = ProjectFactory.eINSTANCE.createOrganization();
		// use the API to set modeled properties
		organization.setName("The Inc.");
		organization.setUuid(UUID.randomUUID().toString());
		// add the created object to a resource
		container.getContents().add(organization);

		return organization;
	}

	public void initDemoData(Organization organization) {
		// create a new project object and use the provided API to set properties
		Project fooTc = ProjectFactory.eINSTANCE.createProject();
		fooTc.setName("Foo Thin Client");
		fooTc.setUuid(UUID.randomUUID().toString());
		// add the project to a container
		organization.getProjects().add(fooTc);

		Project snafu = ProjectFactory.eINSTANCE.createProject();
		organization.getProjects().add(snafu);
		snafu.setName("SNAFU");
		snafu.setUuid(UUID.randomUUID().toString());

		Person alice = ProjectFactory.eINSTANCE.createPerson();
		organization.getEmployees().add(alice);
		alice.setName("Alice");
		alice.setUuid(UUID.randomUUID().toString());
		alice.setEmail("alice@the-inc.com");
		alice.setWeeklyWorkload(32);

		Participant aliceFoo = ProjectFactory.eINSTANCE.createParticipant();
		aliceFoo.setPerson(alice);
		aliceFoo.setProject(fooTc);
		aliceFoo.setRole(ParticipantRole.DEVELOPER);
		aliceFoo.setWeeklyWorkload(16);

		Person bob = ProjectFactory.eINSTANCE.createPerson();
		organization.getEmployees().add(bob);
		bob.setName("Bob");
		bob.setUuid(UUID.randomUUID().toString());
		bob.setEmail("bob@the-inc.com");
		bob.setWeeklyWorkload(40);

		final Participant bobFoo = ProjectFactory.eINSTANCE.createParticipant();
		bobFoo.setPerson(bob);
		bobFoo.setProject(fooTc);
		bobFoo.setRole(ParticipantRole.TESTER);
		bobFoo.setWeeklyWorkload(8);

		final Participant bobSnafu = ProjectFactory.eINSTANCE.createParticipant();
		bobSnafu.setPerson(bob);
		bobSnafu.setProject(snafu);
		bobSnafu.setRole(ParticipantRole.DEVELOPER);
		bobSnafu.setWeeklyWorkload(32);

		Participant bobSnafuTester = ProjectFactory.eINSTANCE.createParticipant();
		bobSnafuTester.setPerson(bob);
		bobSnafuTester.setProject(snafu);
		bobSnafuTester.setRole(ParticipantRole.TESTER);
		bobSnafuTester.setWeeklyWorkload(8);

		Person charlie = ProjectFactory.eINSTANCE.createPerson();
		charlie.setUuid(UUID.randomUUID().toString());
		charlie.setName("Charlie");
		charlie.setEmail("charlie@the-inc.com");
		charlie.setOrganization(organization);
		charlie.setWeeklyWorkload(32);

		Participant charlieSnafu = ProjectFactory.eINSTANCE.createParticipant();
		charlieSnafu.setPerson(charlie);
		charlieSnafu.setProject(snafu);
		charlieSnafu.setRole(ParticipantRole.DEVELOPER);
		charlieSnafu.setWeeklyWorkload(24);
	}

}
