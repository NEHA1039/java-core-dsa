/**
 * Topic: Constructors in Java
 *
 * Concepts:
 * - Default constructor
 * - Parameterized constructor
 * - Object initialization
 *
 * Author: Neha Thorat
 * Day: 5
 */
public class ConstructorDemo {

    String name;
    int age;

    // Default constructor
    public ConstructorDemo() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ConstructorDemo obj1 = new ConstructorDemo();
        obj1.display();

        ConstructorDemo obj2 = new ConstructorDemo("Neha", 20);
        obj2.display();
    }
}
