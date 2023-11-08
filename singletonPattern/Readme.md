
## Singleton design

The Singleton design pattern is used to ensure that a class has only one instance and provides a global point of access to that instance. There are two common ways to implement the Singleton pattern in Java: Eager Initialization and Lazy Initialization.


### Eager Initialization:
In the eager initialization approach, the Singleton instance is created when the class is loaded, regardless of whether it is needed or not.

Example : 

```bash
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
```
### Lazy Initialization:
In the lazy initialization approach, the Singleton instance is created only when it is requested for the first time. This approach can save resources if the Singleton is not always needed.

Example : 

```bash
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

```

### Use case:
Singleton Configuration Class:

In a software application, you often need to manage configuration settings like database connection details, application properties, or environment settings. It's essential to have a single point of access for these configuration settings to ensure consistency throughout the application. A Singleton pattern is an excellent choice for this use case.
```bash
public class Configuration {
    private static Configuration instance;
    private String databaseUrl;
    private String apiKey;

    // Private constructor to prevent instantiation from other classes
    private Configuration() {
        // Initialize configuration settings from a file or other sources
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        this.apiKey = "your_api_key_here";
    }

    // Public method to provide access to the instance and create it if it doesn't exist
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();  //try to make it synchronized using synchronized block
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    // Other methods and fields related to configuration
}
```
In this example:

1. The Configuration class has a private constructor to prevent direct instantiation from other classes.
2. The getInstance() method provides access to the Singleton instance and ensures that only one instance of Configuration is created throughout the application's lifecycle.
3. The databaseUrl and apiKey fields store configuration settings, and they are initialized within the private constructor.
