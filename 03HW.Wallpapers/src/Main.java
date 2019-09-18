public class Main {
    public static void main(String[] args) {
        // All in cm
        int roomWidth = 300;
        int roomLength = 400;
        int roomHeight = 270;

        int rollLength = 1000;
        int rollWidth = 100;
        int stripLengthReserve = 10;
        int rapport = 60;
        int rapportOffset = 30;


        int perimeter = (roomWidth + roomLength) * 2;
        int stripCount = perimeter / rollWidth;
        if (perimeter % rollWidth > 0) {
            stripCount++;
        }
        int stripLength = roomHeight + stripLengthReserve;
        int stripsFromRoll;
        if (rapport != 0) {
            if (rapportOffset == 0) {
                if (stripLength % rapport > 0) {
                    stripLength = (stripLength / rapport + 1) * rapport;
                }
            } else {
                if (rapportOffset > stripLength % rapport) {
                    stripLength = (2 * stripLength / rapport + 1) * rapport / 2;
                } else {
                    int lengthWithOffset = stripLength + rapportOffset;
                    if (stripLength % rapport > 0) {
                        stripLength = (stripLength / rapport + 1) * rapport;
                    }

                    if (stripLength < lengthWithOffset) {
                        stripLength += rapport / 2;
                    }
                }
            }
        }
        stripsFromRoll = rollLength / stripLength;
        int summary = stripCount / stripsFromRoll;
        if (stripCount % stripsFromRoll > 0) {
            summary++;
        }
        System.out.println(summary);
    }
}
