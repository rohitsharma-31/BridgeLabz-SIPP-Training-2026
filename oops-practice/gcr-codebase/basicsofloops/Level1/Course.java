public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " weeks | Fee: " + fee + " | Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Core Java", 6, 15000.0);
        Course c2 = new Course("Spring Boot", 8, 22000.0);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("BridgeLabz Academy");
        c1.displayCourseDetails();
    }
}
