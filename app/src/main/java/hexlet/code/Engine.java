package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;
    public static void greeting(String rules) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
    }
    public static String getName() {
        return name;
    }
    public static boolean isCorrectAnswer(boolean equally, Object trueAnswer, Object answer) {
        if (equally) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer +  "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
            System.out.println("Let's try again, " + getName() + "!");
            return true;
        }
        return false;
    }

    public static void congratulations(boolean equally) {
        if (equally) {
            System.out.println("Congratulations, " + getName() + "!");
        }
    }
}

