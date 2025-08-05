import java.util.*;
class Constructor{
    int age;
    String name;
    Constructor(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    Constructor(Constructor other)
    {
        this.age = other.age;
        this.name=other.name;
    }
    void display()
    {
        System.out.println(name+ " " +age);
    }


}
public class ConsturctorDemo {
    public static void main(String[] args) {
        Constructor myobj = new Constructor(20,"Rudra");
        Constructor myobj1 = new Constructor(myobj);
        myobj.display();
        myobj1.display();

    }
}
