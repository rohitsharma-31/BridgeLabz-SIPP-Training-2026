import java.util.*;

public class SmartClassroomAttendance {
    private HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public void mark(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> list = attendance.get(subject);
        if (!list.contains(student)) list.add(student);
    }

    public List<String> getStudents(String subject) {
        return attendance.containsKey(subject) ? new ArrayList<>(attendance.get(subject)) : Collections.emptyList();
    }

    public int totalInSubject(String subject) {
        return attendance.containsKey(subject) ? attendance.get(subject).size() : 0;
    }

    public Set<String> subjects() { return attendance.keySet(); }

    public static void main(String[] args) {
        SmartClassroomAttendance sc = new SmartClassroomAttendance();
        sc.mark("Math", "Alice");
        sc.mark("Math", "Bob");
        sc.mark("Physics", "Alice");
        sc.mark("Math", "Alice"); // duplicate ignored

        for (String s : sc.subjects()) {
            System.out.println(s + ": " + sc.getStudents(s) + " (Total: " + sc.totalInSubject(s) + ")");
        }
    }
}
package Collectionframework;
import java.util.*;

public class SmartClassroomAttendance {
    private HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public void mark(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> list = attendance.get(subject);
        if (!list.contains(student)) list.add(student);
    }

    public List<String> getStudents(String subject) {
        return attendance.containsKey(subject) ? new ArrayList<>(attendance.get(subject)) : Collections.emptyList();
    }

    public int totalInSubject(String subject) {
        return attendance.containsKey(subject) ? attendance.get(subject).size() : 0;
    }

    public Set<String> subjects() { return attendance.keySet(); }

    public static void main(String[] args) {
        SmartClassroomAttendance sc = new SmartClassroomAttendance();
        sc.mark("Math", "Alice");
        sc.mark("Math", "Bob");
        sc.mark("Physics", "Alice");
        sc.mark("Math", "Alice"); // duplicate ignored

        for (String s : sc.subjects()) {
            System.out.println(s + ": " + sc.getStudents(s) + " (Total: " + sc.totalInSubject(s) + ")");
        }
    }
}
