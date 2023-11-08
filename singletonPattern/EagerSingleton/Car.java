package singletonPattern.EagerSingleton;

public class Car {
     // Private static instance of the class
    private static Car car = new Car();

     // Private constructor to prevent instantiation from other classes
    private Car () {

    }

    // Public method to provide access to the instance
    public static Car getInstance () {
        return car;
    }


}
