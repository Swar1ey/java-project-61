package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameEven {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void game() {
        String[][] questionAnswer = new String[Engine.MAX_ROUNDS][];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            questionAnswer[i] = getResult();
        }
        Engine.playGame(questionAnswer, RULES);
    }
    public static String[] getResult() {
        String[] questionAnswers = new String[2];
        int number = Utils.generateRandomNumber(Utils.DEFAULT_MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);
        questionAnswers[0] = String.valueOf(number);
        boolean isEven = number % 2 == 0;
        questionAnswers[1] = isEven ? "yes" : "no";
        return questionAnswers;
    }
}
