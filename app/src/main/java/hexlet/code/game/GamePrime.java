package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GamePrime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        int number = Utils.generateRandomNumber(MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);
        questionAnswers[0] = String.valueOf(number);
        for (var i = 2; i < (number + 1) / 2; i++) {
            if (number % i == 0) {
                questionAnswers[1] = "no";
                return questionAnswers;
            }
        }
        questionAnswers[1] = "yes";
        return questionAnswers;
    }
}
