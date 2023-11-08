package singletonPattern.LazySingleton;

public class Car {
    // Private instance variable, initialized to null
    private static Car car;

    // Private constructor to prevent instantiation from other classes
    private Car() {

    }

    // Public method to provide access to the instance, and create it if it doesn't
    // exist
    // But this method is not thread safe so we can use synchronized method or
    // synchronized block
    /*
     * public static Car getInstance() {
     * if (car == null) {
     * car = new Car();
     * }
     * return car;
     * }
     */

    public static Car getInstance() {
        if (car == null) {
            // synchronized block
            synchronized (Car.class) {
                if (car == null) {
                    car = new Car();
                }
            }
        }
        return car;
    }

}
