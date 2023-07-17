package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class GameProgression implements Engine.GameLogic {
    public boolean playRound() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hideIndex = random.nextInt(10);
        int startProgrs = random.nextInt(100);
        int increase = random.nextInt(1,15);
        var result = 0;
        System.out.print("Question: ");
        for (var i = 0; i < 10; i++) {
            if (hideIndex != i) {
                System.out.print(startProgrs + " ");
                startProgrs += increase;
            } else {
                System.out.print(".. ");
                result = startProgrs;
                startProgrs += increase;
            }
            if (i == 9) {
                System.out.println();
            }
        }
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();
        if (answer == result) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".");
            return false;
        }
    }
}
