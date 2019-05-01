package de.whz.modeling.example.rcp.helpers;

import java.io.IOException;
import java.util.Collections;

import javax.inject.Singleton;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.rcp.Activator;

@Singleton
@Creatable
public class DataRepository {

	private Resource resource = null;
	public static final String DEFAULT_RESOURCE_PATH = System.getProperty("user.home") + "/.modeling_example/theProject.project";

	public Resource loadResource() {
		final URI fileUri = URI.createFileURI(DEFAULT_RESOURCE_PATH);
		resource = new ResourceSetImpl().createResource(fileUri);

		try {
			resource.load(Collections.emptyMap());
		} catch (final IOException e) {
			// catch exception, resource will be initialized with demo data and saved later
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, fileUri + " not found! Try to create a demo file."));
		}

		// dirty little hack to initialize data
		if (resource.getContents().isEmpty()) {
			final Organization organization = DemoDataHelper.INSTANCE.createRootOrganization(resource);
			DemoDataHelper.INSTANCE.initDemoData(organization);
		}
		DemoDataHelper.INSTANCE.setContextOrganization((Organization) resource.getContents().get(0));
		return resource;
	}

	public Resource getResource() {
		if (resource == null) {
			loadResource();
		}
		return resource;
	}

	public void saveResource() throws IOException {
		if (resource != null) {
			resource.save(Collections.emptyMap());
		} else {
			throw new IllegalStateException("Resource is not initialized! Save is not a vaild action!");
		}
	}

}
