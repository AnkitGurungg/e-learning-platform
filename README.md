# e-learning-platform

- #### Database Class Diagram
![Pic not found](diagrams/database-class-diagram.png)

- #### Transform database table to java class
![Pic not found](diagrams/transform-database-table-to-java-class.png)

- #### Difference between Hibernate and Spring Data JPA
![Pic not found](diagrams/difference-between-hibernate-and-spring-data-jpa.png)

- #### Difference between Hibernate and Spring Data JPA
![Pic not found](diagrams/difference-between-hibernate-and-spring-data-jpa.png)

- #### Different types of generation strategies
![Pic not found](diagrams/different-types-of-generation-strategies.png)

- #### Use JpaRepository to implement dao layer to interact with database and abstract data access layer from business logic
![Pic not found](diagrams/use-jpa-repository-to-implement-dao-layer-to-interact-with-database-and-abstract-data-access-layer-from-business-logic.png)

- #### Hierarchy of JpaRepository 
![Pic not found](diagrams/hierarchy-of-jpa-repository.png)

- #### Hibernate Entity Lifecycle
![Pic not found](diagrams/hibernate-entity-lifecycle.png)

- #### Use inheritance on common field having entity classes by creating BaseEntity class to avoid code duplication
![Pic not found](diagrams/use-inheritance-on-common-field-having-entity-classes-by-creating-baseentity-class-to-avoid-code-duplication.png)

- #### Install-PostgreSQL using docker
![Pic not found](diagrams/install-postgresql-using-docker.png)

- #### Install MySQL using docker
![Pic not found](diagrams/install-mysql-using-docker.png)

## Entity relationship types in JPA:
-Unidirectional relationship</br>
-Bidirectional relationship

## Ways to implement Inheritance in JPA:
#### - Single Table strategy (default)
Use single table strategy in JPA/Hibernate to implement inheritance hierarchy to entities to a single database table where discriminator column is used to determine which subclass a particular row belongs to.

#### - Joint Table Strategy
Use joint table strategy in JPA/Hibernate to implement inheritance hierarchy where each subclass is mapped to a separate table with a foreign key pointing to base table with only the properties that are specified to that subclass.

#### - Table per Class Strategy
Use table per class strategy in JPA/Hibernate to implement inheritance hierarchy where each class will have its own table with a copy of all the properties inherited from base class.

#### (Composition over inheritance because it is flexible and easier to change but both are ways to achieve code reusability and modularity in OOP. Composition evolves creating a class that has reference to one or more subject and delegates or assigns tasks to these subjects which allows to combine the functionality of multiple classes into a single class without the inheritance hierarchy of a base and subclass. It is more flexible because the object can be changed that a class delegates without affecting the class itself)