package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameCalc {
    private static final String RULES = "What is the result of the expression?";
    private static final int COUNT_OPERTOR = 2;

    public static void game() {
        String[][] questionAnswer = new String[Engine.MAX_ROUNDS][];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            questionAnswer[i] = getResult();
        }
        Engine.playGame(questionAnswer, RULES);
    }
    public static String[] getResult() {
        String[] questionAnswers = new String[2];

        int number1 = Utils.generateRandomNumber(Utils.DEFAULT_MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);
        int number2 = Utils.generateRandomNumber(Utils.DEFAULT_MIN_NUMBER, Utils.DEFAULT_MAX_NUMBER);
        int operator = Utils.generateRandomNumber(Utils.DEFAULT_MIN_NUMBER, COUNT_OPERTOR);

        switch (operator) {
            case 0:
                questionAnswers[0] = (number1 + " + " + number2);
                questionAnswers[1] = String.valueOf(number1 + number2);
                return questionAnswers;
            case 1:
                questionAnswers[0] = (number1 + " - " + number2);
                questionAnswers[1] = String.valueOf(number1 - number2);
                return questionAnswers;
            default:
                questionAnswers[0] = (number1 + " * " + number2);
                questionAnswers[1] = String.valueOf(number1 * number2);
                return questionAnswers;
        }
    }
}
