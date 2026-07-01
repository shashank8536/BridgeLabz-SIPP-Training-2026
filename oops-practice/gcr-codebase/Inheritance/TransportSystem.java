interface FuelSupport {
    void refuel();
}

class BaseVehiclee {

    int maxSpeed;
    String model;

    BaseVehiclee(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricCarr extends BaseVehiclee {

    ElectricCarr(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is Charging...");
    }
}

class PetrolCar extends BaseVehiclee implements FuelSupport {

    PetrolCar(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is Refueling...");
    }
}

public class TransportSystem {

    public static void main(String[] args) {

        ElectricCarr ev = new ElectricCarr(180, "Tesla");

        PetrolCar pv = new PetrolCar(220, "Honda City");

        ev.charge();
        pv.refuel();
    }
}