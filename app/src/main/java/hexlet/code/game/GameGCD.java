package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class GameGCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
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
            int answer = scanner.nextInt();
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
        int temp;

        int number1 = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        int number2 = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        question = ("Question: " + number1 + ' ' + number2);

        while (number2 != 0) {
            temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }
}
