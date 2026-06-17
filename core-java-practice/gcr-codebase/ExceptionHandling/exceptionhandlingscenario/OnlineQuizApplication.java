public class OnlineQuizApplication {
    public static void main(String[] args) {
        String[] answers = {"A", "B", "C", "D"};
        String[] submitted = {"A", "B", null, "D", "A"};

        for (int i = 0; i < submitted.length; i++) {
            try {
                if (answers[i].equals(submitted[i])) {
                    System.out.println("Question " + i + ": correct");
                } else {
                    System.out.println("Question " + i + ": incorrect");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Question " + i + ": no reference answer available.");
            } catch (NullPointerException e) {
                System.out.println("Question " + i + ": submitted answer is missing.");
            }
        }
    }
}
