/**Topic:Abstraction
 * 
 * Concepts:
 * Interface Defination
 * Implementing Interface
 * 
 * Author:Neha Thorat
 * Day 13
 */

interface Animal{
    void sleep();
}
class Dog implements Animal{
    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
public class InterfaceDemo{
    public static void main(String args[]){
        Animal a=new Dog();
        a.sleep();
    }
}