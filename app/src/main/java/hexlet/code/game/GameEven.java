package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class GameEven {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ROUNDS = 3;
    private static int count = 0;
    public static void game() {
        Engine.greeting(RULES);

        while (count < MAX_ROUNDS) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int number = random.nextInt(MAX_NUMBER);

            System.out.println("Question: " + number);
            System.out.print(("Your answer: "));
            String answer = scanner.next();
            boolean isEven = number % 2 == 0;
            boolean correctAnswer = ((!isEven && answer.equals("no")) || (isEven && answer.equals("yes")));
            String isCorrectAnswer = isEven ? "'yes'" : "'no'";
            if (Engine.isCorrectAnswer(correctAnswer, isCorrectAnswer, answer)) {
                break;
            } else {
                count++;
            }
            Engine.congratulations(count == MAX_ROUNDS);
        }
    }
}
