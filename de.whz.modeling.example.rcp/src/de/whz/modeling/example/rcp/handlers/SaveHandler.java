
package de.whz.modeling.example.rcp.handlers;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Execute;

import de.whz.modeling.example.rcp.Activator;
import de.whz.modeling.example.rcp.helpers.DataRepository;

public class SaveHandler {

	@Inject
	private DataRepository repo;

	@Execute
	public void execute() {
		try {
			repo.saveResource();
		} catch (final IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not save resource!", e));
		} catch (final IllegalStateException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error while saving resource!", e));
		}
	}
}