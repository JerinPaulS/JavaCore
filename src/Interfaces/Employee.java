package Interfaces;

public class Employee {

    public static void main(String[] args) {
        Person obj1 = new SoftwareEngineer();
        System.out.println(obj1.profession());

        Person obj2 = new Teacher();
        System.out.println(obj2.profession());
    }

}
