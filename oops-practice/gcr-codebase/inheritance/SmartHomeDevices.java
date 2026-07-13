class Device {
    private int deviceId;
    private String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + " | Status: " + status);
    }
}

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(1, "ON", 22);
        thermostat.displayStatus();
    }
}
