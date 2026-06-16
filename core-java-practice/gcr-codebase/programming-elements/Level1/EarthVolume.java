public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("Volume of Earth in km^3 = " + volumeKm);
        System.out.println("Volume of Earth in miles^3 = " + volumeMiles);
    }
}
