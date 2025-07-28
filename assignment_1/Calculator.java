
import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;

    public void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0; 
        }
    }

    public void show() {
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + multi(a, b));
        System.out.println("Division: " + div(a, b));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        calc.setValues(a, b);

        calc.show();
    }
}
