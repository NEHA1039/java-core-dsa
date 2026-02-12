/**
 * Topic: this Keyword
 *
 * Concepts:
 * - Refers to current object
 * - Resolves variable shadowing
 *
 * Author: Neha Thorat
 * Day: 6
 */public class ThisKeywordDemo{
    int age;
    String name;
    public ThisKeywordDemo(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println("age"+" "+age);
        System.out.println("name"+" "+name);

    }
    public static void main(String[] args){
        ThisKeywordDemo obj=new ThisKeywordDemo(20,"Neha");
        obj.display();
    }

}