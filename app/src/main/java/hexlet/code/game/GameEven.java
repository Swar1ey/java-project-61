package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class GameEven implements Engine.GameLogic {
    public boolean playRound() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100);
        System.out.println("Question: " + number);
        System.out.print(("Your answer: "));
        String answer = scanner.next();
        boolean isEven = number % 2 == 0;
        boolean correctAnswer = ((!isEven && answer.equals("no")) || (isEven && answer.equals("yes")));
        String isCorrectAnswer = isEven ? "'yes'" : "'no'";

        if (correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + isCorrectAnswer + ".");
            return false;
        }
    }
}