package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static final String GREET_NUM = "1";
    public static final String EVEN_NUM = "2";
    public static final String CALC_NUM = "3";
    public static final String GCD_NUM = "4";
    public static final String PROGRESSION_NUM = "5";
    public static final String PRIME_NUM = "6";
    public static final String EXIT_NUM = "0";
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String chosenGame = scanner.nextLine();
        switch (chosenGame) {
            case GREET_NUM:
                Cli.greetUser();
                break;
            case EVEN_NUM:
                Even.runGame();
                break;
            case CALC_NUM:
                Calc.runGame();
                break;
            case GCD_NUM:
                GCD.runGame();
                break;
            case PROGRESSION_NUM:
                Progression.runGame();
                break;
            case PRIME_NUM:
                Prime.runGame();
                break;
            case EXIT_NUM:
                System.out.println("Goodbye!");
            default:
                System.out.println("Incorrect input!");
        }
    }
}
