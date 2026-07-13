import java.util.*;

public class SmartParkingManager {
    private ArrayList<String> parked = new ArrayList<>();

    public void enter(String reg) {
        parked.add(reg);
    }

    public boolean exit(String reg) {
        return parked.remove(reg);
    }

    public boolean isParked(String reg) {
        return parked.contains(reg);
    }

    public List<String> allParked() {
        return new ArrayList<>(parked);
    }

    public int total() {
        return parked.size();
    }

    public static void main(String[] args) {
        SmartParkingManager mgr = new SmartParkingManager();
        mgr.enter("KA01AB1234");
        mgr.enter("TN10XY9999");
        System.out.println("Is KA01AB1234 parked? " + mgr.isParked("KA01AB1234"));
        mgr.exit("KA01AB1234");
        System.out.println("Parked vehicles: " + mgr.allParked());
        System.out.println("Total occupied slots: " + mgr.total());
    }
}
package Collectionframework;
import java.util.*;

public class SmartParkingManager {
    private ArrayList<String> parked = new ArrayList<>();

    public void enter(String reg) {
        parked.add(reg);
    }

    public boolean exit(String reg) {
        return parked.remove(reg);
    }

    public boolean isParked(String reg) {
        return parked.contains(reg);
    }

    public List<String> allParked() {
        return new ArrayList<>(parked);
    }

    public int total() {
        return parked.size();
    }

    public static void main(String[] args) {
        SmartParkingManager mgr = new SmartParkingManager();
        mgr.enter("KA01AB1234");
        mgr.enter("TN10XY9999");
        System.out.println("Is KA01AB1234 parked? " + mgr.isParked("KA01AB1234"));
        mgr.exit("KA01AB1234");
        System.out.println("Parked vehicles: " + mgr.allParked());
        System.out.println("Total occupied slots: " + mgr.total());
    }
}
