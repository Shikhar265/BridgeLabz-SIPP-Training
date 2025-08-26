// 🔹 Defining the interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// 🔹 Implementing interface in Light
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("💡 Light is ON");
    }
    public void turnOff() {
        System.out.println("💡 Light is OFF");
    }
}

// 🔹 Implementing interface in AC
class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("❄️ AC is ON");
    }
    public void turnOff() {
        System.out.println("❄️ AC is OFF");
    }
}

// 🔹 Implementing interface in TV
class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("📺 TV is ON");
    }
    public void turnOff() {
        System.out.println("📺 TV is OFF");
    }
}

// 🔹 Main class to test
public class Smart_Device_Control {
    public static void main(String[] args) {
        // Using interface reference
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        // Turn on devices
        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println("---- Turning Off Devices ----");

        // Turn off devices
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
