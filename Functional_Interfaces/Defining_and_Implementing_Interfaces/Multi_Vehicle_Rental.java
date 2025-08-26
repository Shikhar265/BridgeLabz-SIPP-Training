// Multi_Vehicle_Rental.java

// 🔹 Defining the interface
interface VehicleRental {
    void rent();
    void returnVehicle();
}

// 🔹 Car implements VehicleRental
class Car implements VehicleRental {
    public void rent() {
        System.out.println("🚗 Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("🚗 Car has been returned.");
    }
}

// 🔹 Bike implements VehicleRental
class Bike implements VehicleRental {
    public void rent() {
        System.out.println("🏍️ Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("🏍️ Bike has been returned.");
    }
}

// 🔹 Bus implements VehicleRental
class Bus implements VehicleRental {
    public void rent() {
        System.out.println("🚌 Bus has been rented.");
    }
    public void returnVehicle() {
        System.out.println("🚌 Bus has been returned.");
    }
}

// 🔹 Main class to test
public class Multi_Vehicle_Rental {
    public static void main(String[] args) {
        // Interface references for each vehicle
        VehicleRental car = new Car();
        VehicleRental bike = new Bike();
        VehicleRental bus = new Bus();

        // Renting vehicles
        car.rent();
        bike.rent();
        bus.rent();

        System.out.println("---- Returning Vehicles ----");

        // Returning vehicles
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
