class Notification {
    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending notification to " + recipientName + ": " + message);
    }
}

class EmailNotification extends Notification {
    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {
    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {
    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push notification to " + recipientName + ": " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification("Asha", "Welcome aboard"),
                new SMSNotification("Ravi", "Your OTP is 1234"),
                new PushNotification("Neha", "New update available")
        };

        for (Notification notification : notifications) {
            notification.sendNotification();
        }
    }
}
