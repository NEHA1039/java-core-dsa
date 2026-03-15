 /**
 * topic:Arraylist
 
 * Concepts:
-Dynamic array
-Adding elements
-Accessing elements

Author:Neha Thorat
Day 14
 */
import java.util.ArrayList;
public class ArraylistDemo{
  public static void main(String []args){
    ArrayList<String>list=new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");
    System.out.println("Fruits:"+list);
    System.out.println("first fruit:"+list.get(0));
    list.remove("Banana");
    System.out.println("After removing banana:"+list);
}
} 
