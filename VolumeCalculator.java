class Calculate_volume {

    
    public double volume(double r) {
        return (4.0 / 3.0) * (22.0 / 7.0) * r * r * r;
    }

    
    public double volume(double h, double r) {
        return (22.0 / 7.0) * r * r * h;
    }

    
    public double volume(double l, double b, double h) {
        return l * b * h;
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Calculate_volume vc = new Calculate_volume();

        
        double sphere = vc.volume(7); 
        System.out.println("Volume of Sphere (r=7): " + sphere);

        double cylinder = vc.volume(10, 7); 
        System.out.println("Volume of Cylinder (h=10, r=7): " + cylinder);

        double cuboid = vc.volume(5, 6, 7); 
        System.out.println("Volume of Cuboid (l=5, b=6, h=7): " + cuboid);
    }
}


