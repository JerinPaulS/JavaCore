package Relationship;

import java.util.ArrayList;
import java.util.List;

/**
 * Aggregation (Weak Relationship)
 * Aggregation is a special form of association where one class contains a reference to another class, but both objects can exist independently.
 * The child object is not destroyed when the parent is deleted.
 *
 * Example: A Department has multiple Students, but if a department is removed, the students still exist.
 * Here, if Department is deleted, Student objects still exist.
 */

public class AggregationExample {

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        Department dept = new Department("Computer Science", studentList);
        dept.display();
    }

}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student: " + name);
    }
}

class Department {
    String deptName;
    List<Student> students; // Aggregation

    public Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = students;
    }

    void display() {
        System.out.println("Department: " + deptName);
        for (Student s : students) {
            s.display();
        }
    }
}