
package de.whz.modeling.example.rcp.parts;

import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.whz.modeling.example.project.util.ProjectValidator;

public class GenericEObjectViewPart implements IEditor {

	protected static final String PART_ID = "de.whz.modeling.example.rcp.partdescriptor.genericeditor";
	private Composite content;
	private EObject contextEObject;

	@Inject
	private UISynchronize uiSync;
	@Inject
	private EPartService partService;
	private MPart part;

	@PostConstruct
	public void postConstruct(Composite parent, MPart part) {
		this.part = part;
		content = new Composite(parent, SWT.NONE);
		content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		content.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).margins(10, 10).create());
		content.setLayoutData(GridDataFactory.fillDefaults().create());
	}

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private final LabelProvider genericLabelProvider = new LabelProvider() {
		@Override
		public String getText(Object element) {
			IItemLabelProvider provider = (IItemLabelProvider) adapterFactory.adapt(element, IItemLabelProvider.class);
			if (provider != null)
				return provider.getText(element);
			if (element != null)
				return element.toString();
			else
				return "";
		}
	};

	@Override
	public void setInput(EObject contextObject) {
		this.contextEObject = contextObject;
		if (contextEObject == null)
			return;

		uiSync.syncExec(() -> {
			part.setLabel("View: " + genericLabelProvider.getText(contextEObject));

			for (EStructuralFeature feature : contextEObject.eClass().getEAllStructuralFeatures()) {
				Label label = new Label(content, SWT.NONE);
				String featureLabel = feature.getName();
				if (feature.getLowerBound() > 0)
					featureLabel += " *";
				label.setText(featureLabel);

				if (feature.isMany()) {
					ListViewer listViewer = new ListViewer(content);
					listViewer.setContentProvider(new ArrayContentProvider());
					listViewer.setLabelProvider(genericLabelProvider);
					listViewer.setInput(contextEObject.eGet(feature));
					addDoubleClickSupport(listViewer);
					GridDataFactory.fillDefaults().grab(true, true).applyTo(listViewer.getList());
				} else {
					Text tx = new Text(content, SWT.BORDER);
					GridDataFactory.fillDefaults().grab(true, false).applyTo(tx);
					tx.setText(genericLabelProvider.getText(contextEObject.eGet(feature)));
				}
			}

			GridDataFactory.fillDefaults().span(2, 1).applyTo(new Label(content, SWT.NONE));

			Text txValidation = new Text(content, SWT.MULTI | SWT.BORDER | SWT.WRAP);
			txValidation.setEditable(false);
			txValidation.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
			GridDataFactory.fillDefaults().grab(true, true).span(2, 1).applyTo(txValidation);

			ProjectValidator validator = ProjectValidator.INSTANCE;
			BasicDiagnostic diagnostic = new BasicDiagnostic();
			String validationMessage;
			if (!validator.validate(contextEObject, diagnostic, null)) {
				validationMessage = diagnostic.getChildren().parallelStream().map(diag -> diag.getMessage())
						.collect(Collectors.joining(System.lineSeparator(), "\u2022 ", ""));
			} else {
				validationMessage = "The instance is valid";
			}
			txValidation.setText(validationMessage);

		});
		content.layout();
	}

	private void addDoubleClickSupport(StructuredViewer viewer) {
		viewer.getControl().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				Object selection = viewer.getStructuredSelection().getFirstElement();
				if (selection instanceof EObject) {
					MPart genericEditor = partService.createPart(GenericEObjectViewPart.PART_ID);
					partService.showPart(genericEditor, PartState.ACTIVATE);
					((IEditor) genericEditor.getObject()).setInput((EObject) selection);
				}
			}

		});
	}

}