package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameCalc {
    private static final String RULES = "What is the result of the expression?";
    private static final int COUNT_OPERTOR = 2;
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;
    private static final String[] CALCULATOR_OPERATORS = {" + ", " - ", " * "};

    public static void game() {
        String[][] questionAnswer = new String[Engine.MAX_ROUNDS][];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            questionAnswer[i] = getResult();
        }
        Engine.playGame(questionAnswer, RULES);
    }
    public static String[] getResult() {
        String[] questionAnswers = new String[2];

        int number1 = Utils.generateRandomNumber(MIN_NUMBER, MAX_NUMBER);
        int number2 = Utils.generateRandomNumber(MIN_NUMBER, MAX_NUMBER);
        int operator = Utils.generateRandomNumber(MIN_NUMBER, COUNT_OPERTOR);
        String chooseOperator = CALCULATOR_OPERATORS[operator];

        questionAnswers[0] = number1 + chooseOperator + number2;
        questionAnswers[1] = String.valueOf(calculator(number1, number2, chooseOperator));

        return questionAnswers;
    }

    public static int calculator(int number1, int number2, String chooseOperator) {
        switch (chooseOperator) {
            case " + ":
                return number1 + number2;
            case " - ":
                return number1 - number2;
            case " * ":
                return number1 * number2;
            default:
                throw new NullPointerException();
        }
    }
}
