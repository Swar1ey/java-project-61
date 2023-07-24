package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;
    public static final int MAX_ROUNDS = 3;

    public static void playGame(String[][] correctAnswer, String rules) {
        greeting(rules);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + correctAnswer[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(correctAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void greeting(String rules) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
    }
}
