public class Main {
    public static void main(String[] args) {
        double fuelPerHundred = 9.6;
        double fuelCount = 60;
        if (fuelPerHundred > 0 && fuelCount > 0) {
            int expectedDistance = (int) (fuelCount / fuelPerHundred * 100);
            System.out.println(expectedDistance);
        } else {
            System.out.println("You have made error in source parameters");
        }
    }
}
