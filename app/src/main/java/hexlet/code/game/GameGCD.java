package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class GameGCD implements Engine.GameLogic {
    public boolean playRound() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int temp = 0;

        int number1 = random.nextInt(100) + 1;
        int number2 = random.nextInt(100) + 1;

        System.out.println("Question: " + number1 + ' ' + number2);
        System.out.print(("Your answer: "));
        int answer = scanner.nextInt();
        while (number2 != 0) {
            temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        if (answer == number1) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + number1 + ".");
            return false;
        }
    }
}
