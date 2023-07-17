package hexlet.code;

import java.util.Scanner;
import java.util.Random;
public class GameEven {
    public static void even() {

        Scanner scanner = new Scanner(System.in);
        Random random =new Random();

        System.out.print("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!\n" +
                "Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print(("Answer: "));
            String answer = scanner.next();
            boolean isEven = number % 2 == 0;
            boolean correctAnswer = ((!isEven && answer.equals("no")) || (isEven && answer.equals("yes")));
            String isCorrectAnswer = isEven == true ? "'yes'" : "'no'";

            if (correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer +" is wrong answer ;(. Correct answer was " + isCorrectAnswer + ".\n" +
                        "Let's try again, " + name + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
