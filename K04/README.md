### HAT-Relation (Association)
- Is a ordered relation between to classes. This means a class is connected to an other class via their objects. There are a lot of different relations like: Many-to-Many, Many-to-One and so on... 
- The difference between when aggregation is that the association is the relation between the classes itself.
- Example: A class "Dog" is connected to the class "Owner". This would be a One-To-Many relation.

### Aggregation
- Aggregation means that an object has a reference to an other object. For example ObjA has a relationship with ObjB. But it can also exist alone
- The difference to a Association is that it connects two classes by their objects.
- Example: The object "Dog" is connected to the class "Owner".

### Composition
- Composition is an Object that cant exist alone. It needs a related class.
- Example: A composition could be part of a Program like a exception handler. It cant exist without the Program itself. 