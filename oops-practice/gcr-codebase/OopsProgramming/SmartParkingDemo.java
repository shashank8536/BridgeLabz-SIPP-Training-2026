class Vehicleee {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicleee(String vehicleNumber,
            String ownerName,
            String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println(vehicleNumber + " | "
                + ownerName + " | "
                + vehicleType);
    }
}

public class SmartParkingDemo {

    public static void displayCars(Vehicleee[] vehicles) {

        System.out.println("Cars:");

        for (Vehicleee v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(Vehicleee[] vehicles) {

        System.out.println("\nBikes:");

        for (Vehicleee v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicleee[] vehicles = {
                new Vehicleee("UP01A1", "Palak", "Car"),
                new Vehicleee("UP01A2", "Riya", "Bike"),
                new Vehicleee("UP01A3", "Aman", "Car"),
                new Vehicleee("UP01A4", "Neha", "Bike"),
                new Vehicleee("UP01A5", "Raj", "Car"),
                new Vehicleee("UP01A6", "Ankit", "Bike"),
                new Vehicleee("UP01A7", "Priya", "Car"),
                new Vehicleee("UP01A8", "Rohan", "Bike"),
                new Vehicleee("UP01A9", "Karan", "Car"),
                new Vehicleee("UP01A10", "Simran", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}