
// 🔹 Interface
interface Vehicle {
    void displaySpeed(int speed);

    // ✅ Added later → avoids breaking old implementations
    default void displayBattery(int percent) {
        System.out.println("Battery info not available for this vehicle.");
    }
}

// 🔹 Car (Non-electric)
class Car implements Vehicle {
    @Override
    public void displaySpeed(int speed) {
        System.out.println("Car Speed: " + speed + " km/h");
    }
    // ⚠️ Uses default battery method
}

// 🔹 Bike (Non-electric)
class Bike implements Vehicle {
    @Override
    public void displaySpeed(int speed) {
        System.out.println("Bike Speed: " + speed + " km/h");
    }
    // ⚠️ Uses default battery method
}

// 🔹 Electric Car
class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    // ✅ Override to add battery info
    @Override
    public void displayBattery(int percent) {
        System.out.println("Electric Car Battery: " + percent + "%");
    }
}

// 🔹 Electric Bike
class ElectricBike implements Vehicle {
    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Bike Speed: " + speed + " km/h");
    }

    @Override
    public void displayBattery(int percent) {
        System.out.println("Electric Bike Battery: " + percent + "%");
    }
}

// 🔹 Main Class
public class Smart_Vehicle_Dashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle eCar = new ElectricCar();
        Vehicle eBike = new ElectricBike();

        System.out.println("=== Car Dashboard ===");
        car.displaySpeed(120);
        car.displayBattery(0); // default runs

        System.out.println("\n=== Bike Dashboard ===");
        bike.displaySpeed(80);
        bike.displayBattery(0); // default runs

        System.out.println("\n=== Electric Car Dashboard ===");
        eCar.displaySpeed(100);
        eCar.displayBattery(85);

        System.out.println("\n=== Electric Bike Dashboard ===");
        eBike.displaySpeed(60);
        eBike.displayBattery(65);
    }
}
