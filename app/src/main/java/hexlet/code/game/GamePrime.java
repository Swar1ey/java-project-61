package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GamePrime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_ROUNDS = 3;
    private static int count = 0;
    static String question;
    public static void game() {
        Engine.greeting(RULES);

        while (count < MAX_ROUNDS) {
            Scanner scanner = new Scanner(System.in);
            boolean result = isPrime();
            System.out.println(question);
            System.out.print(("Your answer: "));
            String answer = scanner.next();
            String isCorrectAnswer = result ? "yes" : "no";
            if (Engine.isCorrectAnswer(isCorrectAnswer.equals(answer), isCorrectAnswer, answer)) {
                break;
            } else {
                count++;
            }
            Engine.congratulations(isCorrectAnswer.equals(answer));
        }
    }
    public static boolean isPrime() {
        Random random = new Random();
        int number = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        question = ("Question: " + number);
        for (var i = 2; i < (number + 1) / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
