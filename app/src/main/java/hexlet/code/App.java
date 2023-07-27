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

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.print("Your choice: ");
        String choice = scanner.next();
        switch (choice) {
            case "1" -> Cli.yourName();
            case "2" -> GameEven.game();
            case "3" -> GameCalc.game();
            case "4" -> GameGCD.game();
            case "5" -> GameProgression.game();
            case "6" -> GamePrime.game();
            case "0" -> System.out.println("Good bye!");
            default -> System.out.println("You entered an invalid value, let's try again.");
        }
    }
}
