public class Main {
    public static void main(String[] args) {
        double fuelPerHundred = 9.6;
        int fuelVolume = 60;
        if (fuelPerHundred > 0 && fuelVolume > 0) {
            int expectedDistance = (int) (fuelVolume / fuelPerHundred * 100);
            System.out.println(expectedDistance);
        } else {
            System.out.println("You have made error in source parameters");
        }
    }
}
