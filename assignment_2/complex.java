import java.util.Scanner;
class Complex1 {
    private double r;
    private double im;

    public Complex1() {
        this.r = 0;
        this.im = 0;
    }

    
    public Complex1(double r, double im) {
        this.r = r;
        this.im = im;
    }

    
    public void display() {
        if (im >= 0)
            System.out.println(r + " + " + im + "i");
        else
            System.out.println(r + " - " + Math.abs(im) + "i");
    }

    
    public Complex1 sum(Complex1 other) {
        double realSum = this.r + other.r;
        double imagSum = this.im + other.im;
        return new Complex1(realSum, imagSum);
    }
}
public class complex{
    public static void main(String[] args)
    {
        double r,im;
        double r2,im2;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the real part of the complex number one : ");
        r=sc.nextDouble();
        System.out.print("enter the imaginary part of the complex number one : ");
        im=sc.nextDouble();
        System.out.print("enter the real part of the complex number two : ");
        r2=sc.nextDouble();
        System.out.print("enter the imaginary part of the complex number two : ");
        im2=sc.nextDouble();

        System.out.println("complex number is:");
        Complex1 cmplx1 = new Complex1(r, im);    
        Complex1 cmplx2 = new Complex1(r2, -im2);    
    
        System.out.print("Complex Number 1: ");
        cmplx1.display();

        System.out.print("Complex Number 3: ");
        cmplx2.display();

        
        Complex1 result = cmplx1.sum(cmplx2);
        System.out.print("Sum of Complex Number one and two: ");
        result.display();

    }
}



