package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int evenGame = 2;
        int calcGame = 3;
        int gcdGame = 4;
        int progressionGame = 5;
        int primeGame = 6;
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
        int chosenGame = scanner.nextInt();
        if (chosenGame == 1) {
            Cli.greetUser();
        }
        if (chosenGame == evenGame) {
            Even.game();
        }
        if (chosenGame == calcGame) {
            Calc.game();
        }
        if (chosenGame == gcdGame) {
            GCD.game();
        }
        if (chosenGame == progressionGame) {
            Progression.game();
        }
        if (chosenGame == primeGame) {
            Prime.game();
        }
    }
}
