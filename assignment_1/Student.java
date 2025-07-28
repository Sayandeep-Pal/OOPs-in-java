class Student{
    private int rollNo;
    private String name;
    private double cgpa;

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCgpa(double cgpa){
        if(cgpa >=0 && cgpa <= 10){
            this.cgpa = cgpa;
        }
        else{
            System.out.println("CGPA must be between 0 and 10...");
        }
    }

    @Override
    public String toString(){
        return "Student Roll: " + rollNo + ", Name : " + name + ", CGPA : " + cgpa;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setRollNo(101);
        student1.setName("Sayandeep");
        student1.setCgpa(7.89);

        student2.setRollNo(102);
        student2.setName("Ram");
        student2.setCgpa(9.2);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}