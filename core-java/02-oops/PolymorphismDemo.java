/**
 * Topic:Polymorphism in java
 * Concept:
 * Meyhod overriding
 * Runtime Polymorphism
 * Author:Neha Thorat
 * Day 10
 */
class Animal {

    public void sound(){
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("Dog is making noise");
    }

}

public class PolymorphismDemo {

    public static void main(String[] args){

        Animal s = new Dog();
        s.sound();

    }

}