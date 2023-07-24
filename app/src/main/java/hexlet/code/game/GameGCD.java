package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameGCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUMBER = 1;
    public static void game() {
        String[][] questionAnswer = new String[Engine.MAX_ROUNDS][];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            questionAnswer[i] = getResult();
        }
        Engine.playGame(questionAnswer, RULES);
    }
    public static String[] getResult() {
        String[] questionAnswers = new String[2];
        int temp;
        int number1 = Utils.generateRandomNumber(MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);
        int number2 = Utils.generateRandomNumber(MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);

        while (number2 != 0) {
            temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        questionAnswers[0] = number1 + " " + number2;
        questionAnswers[1] = String.valueOf(number1);
        return questionAnswers;
    }
}
