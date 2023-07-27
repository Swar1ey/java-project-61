package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameProgression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MAX_INDEX = 10;
    private static final int MIN_PROGRESSION = 1;
    private static final int MAX_PROGRESSION = 15;
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
        int hideIndex = Utils.generateRandomNumber(MIN_NUMBER, MAX_INDEX);
        int startProgression = Utils.generateRandomNumber(MIN_NUMBER, MAX_NUMBER);
        int increase = Utils.generateRandomNumber(MIN_PROGRESSION, MAX_PROGRESSION);
        String[] question = createProgression(hideIndex, startProgression, increase);
        questionAnswers[0] = String.join(" ", question);
        questionAnswers[1] = question[hideIndex];
        return questionAnswers;
    }

    public static String[] createProgression(int hideIndex, int startProgression, int increase) {
        String[] arr = new String[MAX_INDEX];
        int result;
        for (var i = 0; i <= MAX_INDEX; i++) {
            result = startProgression + i * increase;
            arr[i] = String.valueOf(result);
        }
        arr[hideIndex] = "..";
        return arr;
    }

}
