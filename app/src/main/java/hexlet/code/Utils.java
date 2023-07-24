package hexlet.code;

public class Utils {
    public static final int DEFAULT_MIN_NUMBER = 0;
    public static final int DEFAULT_MAX_NUMBER = 100;

    public static int generateRandomNumber(int lowerBorder, int upperBorder) {
        return (int) (Math.random() * (upperBorder - lowerBorder + 1) + lowerBorder);
    }
}

