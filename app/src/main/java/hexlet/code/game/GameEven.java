package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameEven {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;
    public static void game() {
        String[][] questionAnswer = new String[Engine.MAX_ROUNDS][];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            questionAnswer[i] = getResult();
        }
        Engine.playGame(questionAnswer, RULES);
    }
    public static String[] getResult() {
        String[] questionAnswers = new String[2];
        int number = Utils.generateRandomNumber(MIN_NUMBER, MAX_NUMBER);
        questionAnswers[0] = String.valueOf(number);
        questionAnswers[1] = isEven(number) ? "yes" : "no";
        return questionAnswers;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
