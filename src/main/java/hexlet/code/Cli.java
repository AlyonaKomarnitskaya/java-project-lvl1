package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        Scanner console = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String userName = console.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
