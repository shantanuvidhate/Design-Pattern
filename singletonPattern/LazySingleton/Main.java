package singletonPattern.LazySingleton;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();

        // return hashCode to verify the object are same and created only once
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}
