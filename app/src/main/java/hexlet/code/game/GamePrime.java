package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GamePrime implements Engine.GameLogic {
    public boolean playRound() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Question: " + number);
        System.out.print(("Your answer: "));
        String answer = scanner.next();
        boolean isPrime = true;
        for (var i = 2; i < (number + 1) / 2 ; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        String isCorrectAnswer = isPrime ? "yes" : "no";
        if (answer.equals(isCorrectAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + isCorrectAnswer + ".");
            return false;
        }
    }
}
