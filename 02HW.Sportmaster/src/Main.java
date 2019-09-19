public class Main {
    public static void main(String[] args) {

        int sumOfPrevBuys = 100000;
        int sumOfCurrentBuy = 3000;
        if (sumOfPrevBuys < 0 && sumOfCurrentBuy <= 0) {
            System.out.println("You have made mistake in source parameters.");
            return 1;
        }
        int bonusChunk = 1000;
        int stdBonus = 50;
        int silverBonus = 70;
        int silverSum = 15_000;
        int goldBonus = 100;
        int goldSum = 150_000;

        int bonusPerChunk = stdBonus;

        if (sumOfPrevBuys > silverSum) {
            bonusPerChunk = silverBonus;
        }

        if (sumOfPrevBuys > goldSum) {
            bonusPerChunk = goldBonus;
        }

        int currentBonus = sumOfCurrentBuy / bonusChunk * bonusPerChunk;
        System.out.println(currentBonus);

    }
}
