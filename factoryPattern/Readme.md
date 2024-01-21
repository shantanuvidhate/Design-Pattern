## Factory Design Pattern

### Use cases
```1.``` When there is superclass and multiple subclasses and we want to get object of subclasses based on input and requirement.

```2.```  When the process of object creation is complex, involving multiple steps or dependencies, a factory method can encapsulate this complexity and provide a simple interface for creating objects.

```3.``` When the exact type of the object to be created is not known until runtime, and you want to delegate the decision of object creation to a factory method based on certain conditions or parameters.

```4.``` When you have a class hierarchy (e.g., different types of shapes, as in the example), and the client code should be unaware of the concrete classes but only use the common interface or base class.

### Advantages
```1.``` `Decoupling of Client Code and Object Creation:`Object creation logic is encapsulated within the factory classes, promoting encapsulation. This makes it easier to manage and modify the instantiation process without affecting the rest of the codebase.

`2.` `Code Reusability:` By using factory methods, you can reuse the same object creation logic across multiple parts of your application or even in different projects. This reduces code duplication and promotes a modular design.


The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It falls under the category of creational design patterns and is widely used to create objects in a way that is decoupled from their implementation details. This pattern is particularly useful when the process of object creation is complex, and the system needs to be independent of how its objects are created, composed, and represented.

Let's go through a simple example of the Factory Design Pattern using Java. Suppose we have a shape interface and two concrete classes implementing this interface: Circle and Square.

```java
// Shape interface
public interface Shape {
    void draw();
}

// Concrete class Circle
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete class Square
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
```

Now, let's create a ShapeFactory interface with a method to create a Shape.

```java
// ShapeFactory interface
public interface ShapeFactory {
    Shape createShape();
}
```

Next, we'll implement two concrete factories, CircleFactory and SquareFactory, each responsible for creating a specific type of shape.

```java
//  ShapeFactory Implementation
public class ShapeFactory {
    public static Shape getShape (String shape) {
        if (shape.trim().equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (shape.trim().equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else {
            return null;
        }
    } 
}
```

Now, you can use the factories to create objects without exposing the instantiation logic in the client code.

```java
public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle"); // client provide the object need
        shape.draw();
    }
}

```

This way, the client code can use the factory interface to create objects without needing to know the specific implementation details of the created objects. The Factory Design Pattern promotes loose coupling and flexibility in the object creation process.