public class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println(name + "'s salary increased by " + percent + "%");
        } else {
            System.out.println("Raise percent must be greater than 0.");
        }
    }

    @Override
    public String toString() {
        return "Employee name : " + name + ", salary : " + salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Sayandeep");
        emp1.setSalary(50000);

        Employee emp2 = new Employee();
        emp2.setName("Riya");
        emp2.setSalary(60000);

        emp1.raiseSalary(10);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
