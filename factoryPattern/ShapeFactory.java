package factoryPattern;

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
