package hexlet.code;

import hexlet.code.game.GameCalc;
import hexlet.code.game.GameEven;
import hexlet.code.game.GameGCD;
import hexlet.code.game.GameProgression;
import hexlet.code.game.GamePrime;

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
                "5 - Progression\n"
                +
                "6 - Prime\n"
                +
                "0 - Exit");
        System.out.print("Your choice: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                Cli.yourName();
                break;
            case 2:
                GameEven.game();
                break;
            case 3:
                GameCalc.game();
                break;
            case 4:
                GameGCD.game();
                break;
            case 5:
                GameProgression.game();
                break;
            case 6:
                GamePrime.game();
                break;
            case 0:
                break;
            default:
                System.out.println("You entered an invalid value, let's try again.");
                break;
        }
    }
}
