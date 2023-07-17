package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class GameCalc implements Engine.GameLogic {
    public boolean playRound() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int operator = random.nextInt(3);
        int result = 0;

        switch (operator) {
            case 0:
                System.out.println("Question: " + number1 + '+' + number2);
                result = number1 + number2;
                break;
            case 1:
                System.out.println("Question: " + number1 + '-' + number2);
                result = number1 - number2;
                break;
            default:
                System.out.println("Question: " + number1 + '*' + number2);
                result = number1 * number2;
                break;
        }
        System.out.print(("Your answer: "));
        int answer = scanner.nextInt();
        boolean correctAnswer = (answer == result);
        if (correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".");
            return false;
        }
    }
}
