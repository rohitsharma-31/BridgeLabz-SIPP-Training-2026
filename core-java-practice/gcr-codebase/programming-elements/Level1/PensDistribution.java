public class PensDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;
        System.out.println("Pens per student = " + pensPerStudent + ", Remaining pens = " + remainingPens);
    }
}
