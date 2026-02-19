/**Topic:Encapsulation
 * 
 * Concepts:
 * -Private variables
 * -Getter and Setter methods
 * -Controlled access to data
 * 
 * Author-Neha Thorat
 * DAY-9
 * 
 */
class Person{
   private String name;
   private int age;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        if(age>0){
            this.age=age;
        }

    }
    public int getage(){
        return age;
    }

}
public class EncapsulationDemo {
    public static void main(String[]args){
        Person p=new Person();
        p.setname("Neha");
        p.setage(12);
        System.out.println(p.getname());
        System.out.println(p.getage());
    }
}