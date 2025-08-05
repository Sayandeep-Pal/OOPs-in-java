import java.util.Scanner;
class Rectangle{
    private final double length;
    private final double width;
    Rectangle(double length , double width){
        this.length=length;
        this.width=width;

    }
    public double perimeter()
    {
        double perimeter;
        perimeter=2*(length + width);
        return perimeter;
    }
    public double area()
    {
        double area;
        area = length*width;
        return area;
    }
    public boolean isSameArea(Rectangle r)
    {
      return this.area() == r.area();
    }
}
public class ConstructerDemo_two {
    public static void main(String[] args) {
        double l,w;
        double l1,w1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the 1st rectangle: ");
        l=sc.nextDouble();
        System.out.print("enter the width of the 1st rectangle: ");
        w=sc.nextDouble();
        System.out.print("enter the length of the 2nd rectangle: ");
        l1=sc.nextDouble();
        System.out.print("enter the width of the 2nd rectangle: ");
        w1=sc.nextDouble();
        Rectangle r1 = new Rectangle(l,w);
        Rectangle r2 = new Rectangle(l1,w1);
        System.out.println("perimeter of 1st rectangle: "+(int)r1.perimeter());
        System.out.println("perimeter of 2nd rectangle: "+(int)r2.perimeter());
        System.out.println("Area of the 1st rectangle: "+(int)r1.area());
        System.out.println("Area of the 2nd rectangle : " +(int)r2.area());
        if(r1.isSameArea(r2)){
            System.out.println("both the rectangle have same area");
        }
        else
        {
            System.out.println("both the rectangle have different area");
        }
    }
}
