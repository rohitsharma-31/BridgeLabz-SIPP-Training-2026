class UniversityPerson {
    private String name;

    public UniversityPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

class Student extends UniversityPerson {
    private final int studentId;
    private double gpa;

    public Student(String name, int studentId, double gpa) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{studentId=" + studentId + ", gpa=" + gpa + ", name=" + getName() + "}";
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int studentId, double gpa, String thesis) {
        super(name, studentId, gpa);
        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }

    @Override
    public String toString() {
        return "GradStudent{thesis='" + thesis + "', studentId=" + getStudentId() + ", gpa=" + getGpa() + ", name=" + getName() + "}";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        UniversityPerson person = new UniversityPerson("Alex");
        Student student = new Student("Jamie", 101, 8.9);
        GradStudent gradStudent = new GradStudent("Riya", 202, 9.4, "AI Ethics");

        System.out.println(person);
        System.out.println(student);
        System.out.println(gradStudent);

        System.out.println("GradStudent is a Student: " + (gradStudent instanceof Student));
        System.out.println("Student is a Person: " + (student instanceof UniversityPerson));
    }
}
