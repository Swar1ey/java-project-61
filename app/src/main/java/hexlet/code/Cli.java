package hexlet.code;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Cli {
    public static void yourName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
