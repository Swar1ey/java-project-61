package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class GameProgression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MAX_NUMBER = 100;
    private static final int MAX_INDEX = 10;
    private static final int MAX_ROUNDS = 3;
    private static final int MIN_PROGRESSION = 1;
    private static final int MAX_PROGRESSION = 15;
    private static int count = 0;
    private static String question;
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
        int hideIndex = random.nextInt(MAX_INDEX);
        int startProgrs = random.nextInt(MAX_NUMBER);
        int increase = random.nextInt(MIN_PROGRESSION, MAX_PROGRESSION);
        int result = 0;
        question = "Question: ";
        for (var i = 0; i < MAX_INDEX; i++) {
            if (hideIndex != i) {
                question = question + (startProgrs + " ");
                startProgrs += increase;
            } else {
                question = question + (".. ");
                result = startProgrs;
                startProgrs += increase;
            }
        }
        return result;
    }
}
