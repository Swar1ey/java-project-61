package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void yourName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
