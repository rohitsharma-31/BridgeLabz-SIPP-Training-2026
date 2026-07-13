interface Trackable {
    void logActivity(String activity);

    default void resetData() {
        System.out.println("Resetting tracker data.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private String latestActivity;

    @Override
    public void logActivity(String activity) {
        latestActivity = activity;
        System.out.println("Logged activity: " + activity);
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for activity: " + latestActivity);
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();
        device.logActivity("Running 5km");
        device.generateReport();
        device.sendAlert("Activity completed!");
        device.resetData();
    }
}
