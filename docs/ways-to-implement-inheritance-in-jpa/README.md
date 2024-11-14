## Ways to implement Inheritance in JPA:
- #### Single Table strategy (default)
Use single table strategy in JPA/Hibernate to implement inheritance hierarchy to entities to a single database table where discriminator column is used to determine which subclass a particular row belongs to.

- #### Joint Table Strategy
Use joint table strategy in JPA/Hibernate to implement inheritance hierarchy where each subclass is mapped to a separate table with a foreign key pointing to base table with only the properties that are specified to that subclass.

- #### Table per Class Strategy
Use table per class strategy in JPA/Hibernate to implement inheritance hierarchy where each class will have its own table with a copy of all the properties inherited from base class.