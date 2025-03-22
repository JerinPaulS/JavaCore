package Relationship;

/**
 * Composition (Strong Relationship)
 * Composition is a strong form of aggregation where the child object cannot exist without the parent. If the parent is deleted, the child is also deleted.
 *
 * Example: A Car has an engine. If the car is destroyed, the engine is also destroyed.
 * Here, the Engine cannot exist without the Car.
 *
 * Concept	    |  Definition	                                               |     Relationship Type     	|   Dependency
 * -------------------------------------------------------------------------------------------------------------------------------------------
 * Association	|  Two objects interact but can exist independently	           |     Loosely Coupled	    |  No Ownership
 * Aggregation	|  One object contains another, but they can exist separately  |     Has-A (Weak)	        |  Child exists without Parent
 * Composition	|  Strong relationship, one object owns another	               | 	 Has-A (Strong)         |  Child depends on Parent
 * -------------------------------------------------------------------------------------------------------------------------------------------
 */

public class CompositionExample {

    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", "Electric");
        car.drive();
    }

}

class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    void start() {
        System.out.println("Engine " + type + " is starting...");
    }
}

class Car {
    String model;
    private final Engine engine; // Composition: Car owns Engine

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine is created within Car
    }

    void drive() {
        engine.start();
        System.out.println(model + " is driving...");
    }
}