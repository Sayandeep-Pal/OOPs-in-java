class Rect {
  
    private int length_one;
    private int breadth_one;

    public Rect() {
        this.length_one = 0;
        this.breadth_one = 0;
    }

    
    public Rect(int length, int breadth) {
        this.length_one = length;
        this.breadth_one = breadth;
    }

    
    public Rect(int side) {
        this.length_one = side;
        this.breadth_one = side;
    }

    
    public int getArea() {
        return length_one * breadth_one;
    }
}

public class Program_Rectangle {
    public static void main(String[] args) {
        

        
        Rect r1 = new Rect();
        System.out.println("Area of rectangle (no-arg constructor): " + r1.getArea());

        
        Rect r2 = new Rect(20, 10);
        System.out.println("Area of rectangle (two-arg constructor): " + r2.getArea());

       
        Rect r3 = new Rect(10);
        System.out.println("Area of square (one-arg constructor): " + r3.getArea());
    }
}


