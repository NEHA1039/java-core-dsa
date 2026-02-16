/**
 * Topic :Class and Object
 * Concepts:
 * Class Definition
 * Object Creation
 * Instance methods
 * 
 * Author:Neha Thorat
 * Day:8
 */
class Student{
    int age;
     String name;
     public Student(int age,String name){
        this.age=age;
        this.name=name;
     }
     public void display(){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
     }
     public class ClassObjectDemo{
        public static  void main (String[]args){
          Student s1=new Student(20,"Neha");
          s1.display();

        }
     }

     }
