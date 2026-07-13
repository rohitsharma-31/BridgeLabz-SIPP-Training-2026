import java.util.*;

public class AddressBookApp {
    static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String toString() {
            return name + " | " + phone + " | " + email;
        }
    }

    private ArrayList<Contact> list = new ArrayList<>();
    private HashMap<String, Contact> byName = new HashMap<>();
    private HashSet<String> phones = new HashSet<>();

    public boolean add(String name, String phone, String email) {
        if (phones.contains(phone)) return false;
        Contact c = new Contact(name, phone, email);
        list.add(c);
        byName.put(name.toLowerCase(), c);
        phones.add(phone);
        return true;
    }

    public Contact search(String name) {
        return byName.get(name.toLowerCase());
    }

    public boolean delete(String name) {
        Contact c = byName.remove(name.toLowerCase());
        if (c == null) return false;
        list.remove(c);
        phones.remove(c.phone);
        return true;
    }

    public List<Contact> displaySortedByName() {
        List<Contact> copy = new ArrayList<>(list);
        Collections.sort(copy, Comparator.comparing(a -> a.name.toLowerCase()));
        return copy;
    }

    public static void main(String[] args) {
        AddressBookApp ab = new AddressBookApp();
        ab.add("Alice", "12345", "alice@example.com");
        ab.add("Bob", "67890", "bob@example.com");
        ab.add("Charlie", "55555", "charlie@example.com");

        System.out.println("Search Bob: " + ab.search("Bob"));
        System.out.println("Delete Alice: " + ab.delete("Alice"));
        System.out.println("Contacts sorted by name:");
        for (Contact c : ab.displaySortedByName()) System.out.println(c);
    }
}
package Collectionframework;
import java.util.*;

public class AddressBookApp {
    static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String toString() {
            return name + " | " + phone + " | " + email;
        }
    }

    private ArrayList<Contact> list = new ArrayList<>();
    private HashMap<String, Contact> byName = new HashMap<>();
    private HashSet<String> phones = new HashSet<>();

    public boolean add(String name, String phone, String email) {
        if (phones.contains(phone)) return false;
        Contact c = new Contact(name, phone, email);
        list.add(c);
        byName.put(name.toLowerCase(), c);
        phones.add(phone);
        return true;
    }

    public Contact search(String name) {
        return byName.get(name.toLowerCase());
    }

    public boolean delete(String name) {
        Contact c = byName.remove(name.toLowerCase());
        if (c == null) return false;
        list.remove(c);
        phones.remove(c.phone);
        return true;
    }

    public List<Contact> displaySortedByName() {
        List<Contact> copy = new ArrayList<>(list);
        Collections.sort(copy, Comparator.comparing(a -> a.name.toLowerCase()));
        return copy;
    }

    public static void main(String[] args) {
        AddressBookApp ab = new AddressBookApp();
        ab.add("Alice", "12345", "alice@example.com");
        ab.add("Bob", "67890", "bob@example.com");
        ab.add("Charlie", "55555", "charlie@example.com");

        System.out.println("Search Bob: " + ab.search("Bob"));
        System.out.println("Delete Alice: " + ab.delete("Alice"));
        System.out.println("Contacts sorted by name:");
        for (Contact c : ab.displaySortedByName()) System.out.println(c);
    }
}
