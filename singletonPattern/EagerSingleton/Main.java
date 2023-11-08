package singletonPattern.EagerSingleton;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
