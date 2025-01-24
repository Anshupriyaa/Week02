// Device superclass
 class Device {
    private String deviceId;
    private boolean status;

    // constructor
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "On" : "Off"));
    }
}

// Thermostat subclass inheriting the properties of Device superclass
class Thermostat extends Device {
    private double temperature;

    // constructor
    public Thermostat(String deviceId, boolean status, double temperature) {
        super(deviceId, status);
        this.temperature = temperature;
    }

    // Override the displayStatus method from Device superclass
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperature + "°C");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {

        // Create object
        Thermostat homeThermostatus = new Thermostat("THERMO-001", true, 22.5);
        // call the method from the class here
        homeThermostatus.displayStatus();
    }
}

