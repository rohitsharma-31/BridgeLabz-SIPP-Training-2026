import java.util.*;

public class EventEntryVerification {
    private HashSet<String> emails = new HashSet<>();

    public boolean register(String email) {
        return emails.add(email.toLowerCase());
    }

    public Set<String> allParticipants() {
        return new HashSet<>(emails);
    }

    public int total() {
        return emails.size();
    }

    public static void main(String[] args) {
        EventEntryVerification ev = new EventEntryVerification();
        System.out.println("Register alice@example.com: " + ev.register("alice@example.com"));
        System.out.println("Register Alice@example.com again: " + ev.register("Alice@example.com"));
        ev.register("bob@example.com");
        System.out.println("Participants: " + ev.allParticipants());
        System.out.println("Total attendees: " + ev.total());
    }
}
package Collectionframework;
import java.util.*;

public class EventEntryVerification {
    private HashSet<String> emails = new HashSet<>();

    public boolean register(String email) {
        return emails.add(email.toLowerCase());
    }

    public Set<String> allParticipants() {
        return new HashSet<>(emails);
    }

    public int total() {
        return emails.size();
    }

    public static void main(String[] args) {
        EventEntryVerification ev = new EventEntryVerification();
        System.out.println("Register alice@example.com: " + ev.register("alice@example.com"));
        System.out.println("Register Alice@example.com again: " + ev.register("Alice@example.com"));
        ev.register("bob@example.com");
        System.out.println("Participants: " + ev.allParticipants());
        System.out.println("Total attendees: " + ev.total());
    }
}
