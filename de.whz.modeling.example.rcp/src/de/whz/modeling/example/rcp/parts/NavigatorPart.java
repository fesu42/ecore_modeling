
package de.whz.modeling.example.rcp.parts;

import java.io.IOException;
import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;

import de.whz.modeling.example.project.IIdentifiable;
import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.rcp.helpers.DemoDataHelper;
import de.whz.modeling.example.rcp.helpers.TreeItem;
import de.whz.modeling.example.rcp.provider.OrganizationTreeContentProvider;

public class NavigatorPart {

	private Resource res;

	@Inject
	private EPartService partService;

	@PostConstruct
	public void postConstruct(Composite parent) {
		initResource();

		TreeViewer tree = new TreeViewer(parent);
		tree.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof IIdentifiable) {
					return ((IIdentifiable) element).getName();
				} else if (element instanceof TreeItem) {
					return ((TreeItem) element).getName();
				}
				return element.toString() + " :: " + element.getClass().getSimpleName();
			}
		});
		tree.setContentProvider(new OrganizationTreeContentProvider());
		tree.getTree().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				Object selection = tree.getStructuredSelection().getFirstElement();
				if (selection instanceof EObject) {
					MPart genericEditor = partService.createPart(GenericEObjectViewPart.PART_ID);
					partService.showPart(genericEditor, PartState.ACTIVATE);
					((IEditor) genericEditor.getObject()).setInput((EObject) selection);
				}
			}

		});
		tree.setInput(res);
		tree.refresh();
	}

	private void initResource() {
		URI fileUri = URI.createFileURI(System.getProperty("user.home") + "/.modeling_example/theProject.project");
		res = new ResourceSetImpl().createResource(fileUri);

		try {
			res.load(Collections.emptyMap());
		} catch (IOException e) {
			System.err.println(fileUri + " not found. Try to create a demo file...");
		}

		// dirty little hack to initialize data
		if (res.getContents().isEmpty()) {
			Organization organization = DemoDataHelper.INSTANCE.createRootOrganization(res);
			DemoDataHelper.INSTANCE.initDemoData(organization);
		}
	}

	@PreDestroy
	public void preDestroy() {
		try {
			res.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}