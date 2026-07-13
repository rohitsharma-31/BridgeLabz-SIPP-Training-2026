public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber + " | Name: " + name + " | CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student student = new Student(101, "Meera", 9.2);
        student.displayStudentDetails();
        student.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.println("PG Student: " + rollNumber + " | Name: " + name + " | CGPA: " + getCGPA());
    }
}
