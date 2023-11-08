

# Design Patterns

Welcome to my Design Patterns repository! Here, we explore common software design patterns along with code examples in Java. Design patterns are proven solutions to recurring software design problems, helping developers build maintainable, scalable, and robust applications.

Design patterns are reusable solutions to common problems that arise during software design and development. They provide templates, guidelines, and best practices to help developers create well-structured and maintainable software systems. Here are some key points to consider regarding design patterns:

## Table of Contents

- [Creational Patterns](#creational-patterns)
- [Structural Patterns](#structural-patterns)
- [Behavioral Patterns](#behavioral-patterns)

## Creational Patterns

Creational patterns focus on object creation mechanisms, providing flexible and efficient ways to create objects.

- Singleton Pattern: Ensure that a class has only one instance and provide a global point of access to it.
- Factory Method Pattern: Define an interface for creating an object but allow subclasses to alter the type of objects that will be created.
- Abstract Factory Pattern: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
- Builder Pattern: Separate the construction of a complex object from its representation, allowing the same construction process to create different representations.
- Prototype Pattern: Create new objects by copying an existing object, known as the prototype.

## Structural Patterns

Structural patterns deal with object composition, focusing on how classes and objects are structured and related to one another.

- Adapter Pattern: Allow objects with incompatible interfaces to work together by providing a wrapper that adapts one interface to another.
- Bridge Pattern: Separates an object’s abstraction from its implementation, allowing both to vary independently.
- Composite Pattern: Compose objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
- Decorator Pattern: Attach additional responsibilities to objects dynamically, providing a flexible alternative to subclassing for extending functionality.
- Proxy Pattern: Provide a surrogate or placeholder for another object to control access to it.

## Behavioral Patterns

Behavioral patterns deal with communication and collaboration between objects, focusing on how they interact and distribute responsibilities.

- Observer Pattern: Define a one-to-many dependency between objects, so when one object changes state, all its dependents are notified and updated automatically.
- Strategy Pattern: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- Command Pattern: Encapsulate a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- State Pattern: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
- Chain of Responsibility Pattern: Pass the request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
- Visitor Pattern: Represent an operation to be performed on the elements of an object structure. Visitors let you define a new operation without changing the classes of the elements on which it operates.
- Memento Pattern: Capture and externalize an object's internal state so the object can be restored to this state later.
- Template Method Pattern: Define the skeleton of an algorithm in the superclass but let subclasses override specific steps of the algorithm without changing its structure.

## Contributing

Feel free to contribute by adding more design patterns or improving existing examples. Follow the standard GitHub contribution workflow: Fork, clone, create a branch, make changes, create a pull request.

## License

This repository is licensed under the MIT License. See the [LICENSE](https://github.com/shantanuvidhate/Design-Pattern/blob/main/LICENSE) file for details.
