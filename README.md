# E-learning-platform
***

## Table of Contents
- ### [Overview](#overview)
- ### [Features](#features)
- ### [Diagrams](#diagrams)
- ### [Technologies Used](#technologies-used)
- ### [Learning Objectives](#learning-objectives)
- ### [Get Started](#get-started)
- ### [Documentation](#documentation)
***

## Overview
E-learning platform is designed to facilitate the management and delivery of educational content. It provides key functionalities for managing authors, lectures, sections, course and resources, including files, videos, and text. The system is built to support an organized structure for educational courses, enabling easy access to various types of resources.
***

## Features:
- Author Management: Allows the creation and management of authors who can contribute educational content.
- Lecture Management: Organizes lectures under specific courses.
- Section Management: Courses are divided into sections for better navigation and progression.
- Course Resources: Supports various types of course materials, including
  - Files: Attach supplementary resources.
  - Videos: Embed or link video content for lectures.
  - Text: Provide text-based resources for in-depth learning.
***

## Diagrams
#### Database Class Diagram
![Pic not found](docs/diagrams/database-class-diagram.png)
</br>
</br>

#### Transform database table to java class
![Pic not found](docs/diagrams/transform-database-table-to-java-class.png)
</br>
</br>

#### Difference between Hibernate and Spring Data JPA
![Pic not found](docs/diagrams/difference-between-hibernate-and-spring-data-jpa.png)
</br>
</br>

#### Different types of generation strategies
![Pic not found](docs/diagrams/different-types-of-generation-strategies.png)
</br>
</br>

#### Use JpaRepository to implement dao layer to interact with database and abstract data access layer from business logic
![Pic not found](docs/diagrams/use-jpa-repository-to-implement-dao-layer-to-interact-with-database-and-abstract-data-access-layer-from-business-logic.png)
</br>
</br>

#### Hierarchy of JpaRepository 
![Pic not found](docs/diagrams/hierarchy-of-jpa-repository.png)
</br>
</br>

#### Hibernate Entity Lifecycle
![Pic not found](docs/diagrams/hibernate-entity-lifecycle.png)
</br>
</br>

#### Use inheritance on common field having entity classes by creating BaseEntity class to avoid code duplication
![Pic not found](docs/diagrams/use-inheritance-on-common-field-having-entity-classes-by-creating-baseentity-class-to-avoid-code-duplication.png)
</br>
</br>

#### Use Embeddable and EmbeddedId to define composite primary key
![Pic not found](docs/diagrams/use-embeddable-embeddedid-to-define-composite-primary-key.png)
</br>

#### Install-PostgreSQL using docker
![Pic not found](docs/diagrams/install-postgresql-using-docker.png)
</br>
</br>

#### Install MySQL using docker
![Pic not found](docs/diagrams/install-mysql-using-docker.png)
</br>
</br>
***

## Technologies Used
- Spring Boot 3
- Spring Data JPA
- Spring Validation
- Docker
- PostgreSQL
- MySQL
- Git & GitHub
***

## Learning Objectives
- Designing a class diagram from business requirements
- Utilizing inheritance with Spring Data JPA
- Object validation using Spring Validation
- Using Spring Profiles for environment-specific configurations
- Implementing business requirements and handling business exceptions
***

## Get Started
To get started with the e-learning platform project, follow the given setup instructions respectively
- Clone this repository.
- Configure your database (PostgreSQL or MySQL) settings in the application properties.
- Run the application using your preferred IDE or build tools.
***

## Documentation
- [Entity relationship types in JPA](docs/entity-relationship-types-in-jpa/README.md)
- [Ways to implement Inheritance in JPA](docs/ways-to-implement-inheritance-in-jpa/README.md)
- [Why use composition over inheritance](docs/why-use-composition-over-inheritance/README.md)