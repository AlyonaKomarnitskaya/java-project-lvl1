package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void runGame(String description, String[][] questionAndAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.print("Correct answer was " + "'" + questionAndAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
            System.out.println("Congratulations, " + userName + "!");

    }
}
