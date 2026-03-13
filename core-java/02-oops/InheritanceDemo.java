/**
 * Topic:Inheritance
 * Concepts:
 * Parent and Child class
 * extends keyword
 * 
 * Author:Neha Thorat
 * Day 10
 */
class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}
public class InheritanceDemo{
    public static void main(String[]args){
        Dog d=new Dog();
        d.sound();
        d.bark();
    }
}