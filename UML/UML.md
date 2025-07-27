UML - Unified Modelling Language

![UML Basics](images/UMLbasics.png)


Based on the structure and the behaviour of your components, these diagrams can be splitted into 2 categories
Behavioural Diagram - Give overview of what is purpose of a component and what all functions it will support
Structural Diagram - Give how a component is structured
![UML Diagrams](images/UMLDiagrams.png)

****************************************************************************************************************************************

Use Case Diagram
![Use Case Diagram](images/UseCaseDiagram.png)
1. System Boundary - The box that is drawn. Anything written outside the box will not be in the scope
2. Actors - Who is using the system. Actor doesn't need to be human being always. It could be system itself as well
3. Use-Case - High level problem provided which is then splitted into small requirements
4. Include - One use case having a call to the other use-case
5. Extend - There is one main use case the generic use case and then it will sub use cases which are more specific

****************************************************************************************************************************************

Activity Diagram
Use case diagram will give more of a high level design, what all functions will the design support. Activity diagram will give more granular level details, i.e each individual use-case if we have to execute them what all steps will it use
![Activity Diagram](images/ActivityDiagram.png)

****************************************************************************************************************************************

Sequence Diagram
It gives more detail at ground level. Activity Diagram gives the flow from functional prespective but does not tell that at the code level what will the sequence or how the steps will be performed.
![Sequence Diagram](images/SequenceDiagram.png)
![Sequence Diagram Example](images/SequenceDiagramEg.png)

****************************************************************************************************************************************

Class Diagram
It is a support team system to designing of your object oriented modelling. It shows the different relationships or how different entities can correlate with each other and how they can share the information. It gives a static view of how your system look likes.
A class diagram describes the attributes and the operations of a class and also the constraints imposed on that class.
They can be directly mapped to the object oriented modelling.

![Class in Class Diagram](images/ClassCD.png)

![Association](images/Association.png)

![Aggregation](images/Aggregation.png)
Aggregation is a loose association

![Composition](images/Composition.png)
Composition is a restricted association

![Generalization](images/Generalization.png)
Generalization is where will do a parent-child kind of relationship(via extends(inheritance) or implements(interface))

![Dependency](images/Dependency.png)
In the above eg, player move is dependent on Die Roll, hence player is dependent on die

![Multiplicity](images/Multiplicity.png)
It basically tells how many objects of each class can be present in this relationship

![Abstract class, Interface, Enum](images/AbstractInterfaceEnum.png)

Eg. -
![ProblemStatement](images/ClassDiagramProblemStatement.png)

Solution -
![ProblemSolution](images/ClassDiagramSolution.png)