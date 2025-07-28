import java.util.Scanner;

public class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Celsius: ");
        double inputCelsius = scanner.nextDouble();

        temp.setCelsius(inputCelsius);

        System.out.println("Fahrenheit: " + temp.toFahrenheit());
        System.out.println("Kelvin: " + temp.toKelvin());

        scanner.close();
    }
}
