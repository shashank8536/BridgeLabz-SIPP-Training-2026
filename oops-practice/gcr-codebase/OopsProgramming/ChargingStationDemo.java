class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID : " + stationId);
        System.out.println("Units : " + unitsConsumed);
        System.out.println("Bill : " + calculateBill());
        System.out.println();
    }
}

public class ChargingStationDemo {
    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("S1", 100);
        ChargingStation s2 = new ChargingStation("S2", 150);
        ChargingStation s3 = new ChargingStation("S3", 200);
        ChargingStation s4 = new ChargingStation("S4", 250);
        ChargingStation s5 = new ChargingStation("S5", 300);

        ChargingStation.electricityRate = 10;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations = "
                + ChargingStation.totalStations);
    }
}