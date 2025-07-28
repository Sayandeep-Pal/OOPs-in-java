
import java.util.Scanner;

class OddEvenClassifire{
    public boolean isOdd(int x){
        return x%2 != 0;
    }

    public String Display(int x){
        if(isOdd(x)){
            return x + " is Odd.";
        }
        else{
            return x + " is even.";
        }
    }

    public static void main(String[] args) {
        OddEvenClassifire obj = new OddEvenClassifire();
        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = ScannerObj.nextInt();
        System.err.println(obj.Display(num));
    }
}