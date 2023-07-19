package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class GameCalc {
    private static final String RULES = "What is the result of the expression?";
    private static final int OPERTORS = 3;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ROUNDS = 3;
    private static int count = 0;
    static String question;

    public static void game() {
        Engine.greeting(RULES);

        while (count < MAX_ROUNDS) {
            Scanner scanner = new Scanner(System.in);
            int result = getResult();
            System.out.println(question);
            System.out.print("Your answer: ");
            final int answer = scanner.nextInt();
            if (Engine.isCorrectAnswer(result == answer, result, answer)) {
                break;
            } else {
                count++;
            }
            Engine.congratulations(count == MAX_ROUNDS);
        }
    }
    public static int getResult() {
        Random random = new Random();

        int number1 = random.nextInt(MAX_NUMBER);
        int number2 = random.nextInt(MAX_NUMBER);
        int operator = random.nextInt(OPERTORS);


        switch (operator) {
            case 0:
                question = ("Question: " + number1 + " + " + number2);
                return number1 + number2;
            case 1:
                question = ("Question: " + number1 + " - " + number2);
                return number1 - number2;
            default:
                question = ("Question: " + number1 + " * " + number2);
                return number1 * number2;
        }
    }
}
