package hexlet.code;
import hexlet.code.games.Game;
import java.util.Scanner;
import hexlet.code.Cli;

public class Engine {
    public static void runGame(Game game, String name) {
        System.out.println(game.description());
        boolean isRight = true;
        int reiteration = 3;
        for (int i = 0; i < reiteration; i++) {
            String[] questionAnswer = game.questionAndAnswer();
            System.out.println("Question: " + questionAnswer[0]);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals(questionAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + questionAnswer[1] + "'" );
                System.out.println("Let's try again, " + name + "!");
                isRight = false;
                break;
            }
        }
        if (isRight) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
