package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameProgression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MAX_INDEX = 10;
    private static final int MIN_PROGRESSION = 1;
    private static final int MAX_PROGRESSION = 15;
    public static void game() {
        String[][] questionAnswer = new String[Engine.MAX_ROUNDS][];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            questionAnswer[i] = getResult();
        }
        Engine.playGame(questionAnswer, RULES);
    }
    public static String[] getResult() {
        String[] questionAnswers = new String[2];
        int hideIndex = Utils.generateRandomNumber(Utils.DEFAULT_MIN_NUMBER, MAX_INDEX);
        int startProgrs = Utils.generateRandomNumber(Utils.DEFAULT_MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);
        int increase = Utils.generateRandomNumber(MIN_PROGRESSION, MAX_PROGRESSION);
        questionAnswers[0] = "";
        for (var i = 0; i < MAX_INDEX; i++) {
            if (hideIndex != i) {
                questionAnswers[0] = questionAnswers[0] + (startProgrs + " ");
                startProgrs += increase;
            } else {
                questionAnswers[0] = questionAnswers[0] + (".. ");
                questionAnswers[1] = String.valueOf(startProgrs);
                startProgrs += increase;
            }
        }
        return questionAnswers;
    }
}
