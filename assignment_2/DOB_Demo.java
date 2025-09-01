class DOB {
    private int day;
    private int month;
    private int year;
    String name;

    public DOB(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public void show() {
        System.out.printf("Name: %s, DOB: %02d/%02d/%04d\n", name, day, month, year);
    }

    
    public DOB findAgeDiff(DOB other) {
        int d1 = this.day;
        int m1 = this.month;
        int y1 = this.year;

        int d2 = other.day;
        int m2 = other.month;
        int y2 = other.year;

        
        if (d2 < d1) {
            d2 += 30;
            m2 -= 1;
        }

        if (m2 < m1) {
            m2 += 12;
            y2 -= 1;
        }

        int diffDay = d2 - d1;
        int diffMonth = m2 - m1;
        int diffYear = y2 - y1;

        return new DOB("Age Difference", diffDay, diffMonth, diffYear);
    }
}
public class DOB_Demo {
    public static void main(String[] args) {
        // d) Create two persons
        DOB p1 = new DOB("Rudranil", 10, 11, 2004);
        DOB p2 = new DOB("Sayandeep pal", 30, 8, 2010);
        DOB p3 = new DOB("Sayandeep Roy", 10, 11, 1980);
        DOB p4 = new DOB("Soumajit Chatterjee", 30, 10, 2010);
        


        // Display both persons
        System.out.println("Person 1:");
        p1.show();

        System.out.println("Person 2:");
        p2.show();
        System.out.println("Person 3:");
        p3.show();
        System.out.println("Person 4:");
        p4.show();
        
        // Calculate and display age difference
        DOB ageDiff = p1.findAgeDiff(p2);
        System.out.println("\nAge Difference between " + p1.name + "and" + p2.name + "and" + p3.name + "and" + p4.name + ":");
        ageDiff.show();
    }
}


