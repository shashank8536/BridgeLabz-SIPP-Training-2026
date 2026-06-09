public class VolumeOfEarth {

    public static void main(String[] args) {
        double radius = 6378;

        double volumeKm =(4.0 / 3) * Math.PI * radius * radius * radius;

        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is "+ volumeKm +
        " and cubic miles is " +volumeMiles);
    }
}