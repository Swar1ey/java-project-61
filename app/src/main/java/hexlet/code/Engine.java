package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ROUNDS = 3;
    public static void playGame(String desGame, GameLogic gameLogic) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!\n"
                +
                "What is the result of the expression?");

        for (var i = 0; i != MAX_ROUNDS; i++) {
            if (!gameLogic.playRound()) {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public interface GameLogic {
        boolean playRound();
    }
}
