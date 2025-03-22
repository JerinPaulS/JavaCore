package Relationship;

/**
 * Association (General Relationship)
 * Association represents a relationship between two separate classes. It defines how objects of these classes interact with each other.
 * The relationship can be one-to-one, one-to-many, many-to-one, or many-to-many.
 * Example: A Person and an Address are associated but can exist independently.
 * Here, Person has an Address, but Address can exist independently.
 */

public class AssociationExample {

    public static void main(String[] args) {
        Address address = new Address("New York", "USA");
        Person person = new Person("John", address);
        person.display();
    }

}

class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    void display() {
        System.out.println(city + ", " + country);
    }
}

class Person {
    String name;
    Address address; // Association with Address

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(name + " lives in:");
        address.display();
    }
}