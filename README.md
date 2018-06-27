# Ecore Modeling

A little example of creating an ecore model, making use of the EMF Code generation feature and integrating the demo model into a small RCP application.

## Plugin Overview
de.whz.modeling.example
* ~.model - the model and generated source code
* ~.model.edit - generated controller code (such as label provider, etc.)
* ~.model.editor - generated viewer code
* ~.rcp - a sample RCP application, which creates a little demo data set and shows the data in a navigator view. Objects can be viewed in a generic view.

## Installing and Running the examples
Please use the Eclipse Modeling Tools (I used the Oxygen 3 release -> https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygen3a)

### Running the generated Editor Code
Right-click the editor-project > Run as > Eclipse Application. A new Eclipse IDE will open. Here, create a new Project (a general project is fine). To create a new model file right-click again > New > Other... Enter 'project model' in the search field. There should only one entry remain. Select it and click Next. Enter a file name, click Next. Choose 'Organization' as Model Object and finish the wizard. A new editor will open and you can instantiate new objects by right-clicking on any model object (expand the resource first) by using the 'New Child' or 'New Sibling' command.

### Running the RCP Application
Open 'rcp.product' (de.whz.modeling.example.rcp plugin). Clicking the hyperlink 'Launch an new Eclipse application' starts the application.


## Noteworthy code
* de.whz.modeling.example.rcp.helpers.DemoDataHelper - creates the demo data set and gives an overview of the generated API
* de.whz.modeling.example.rcp.parts.GenericEditorPart - although it's no editor at all, this part is able to show any EObject. It explores the metaclass of the context EObject and lists reflectively all modeled properties (EAttributes) and associations (EReferences). Futhermore it validates the context object and lists violations.
* de.whz.modeling.example.model.project.util.ProjectValidator - adds a custom constraint (see method 'validatePerson\_validWorkload) for Participant (see also the attached EAnnotation at Participant in the ecore model).
