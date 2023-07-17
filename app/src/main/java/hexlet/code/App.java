package hexlet.code;

import hexlet.code.game.GameCalc;
import hexlet.code.game.GameEven;
import hexlet.code.game.GameGCD;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                +
                "1 - Greet\n"
                +
                "2 - Even\n"
                +
                "3 - Calc\n"
                +
                "4 - GCD\n"
                +
                "0 - Exit");
        System.out.print("Your choice: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                Cli.yourName();
                break;
            case 2:
                Engine.playGame("Instructions: Answer 'yes' if the number is even, otherwise answer 'no'.",
                        new GameEven());
                break;
            case 3:
                Engine.playGame("What is the result of the expression?", new GameCalc());
                break;
            case 4:
                Engine.playGame("Find the greatest common divisor of given numbers", new GameGCD());
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}
