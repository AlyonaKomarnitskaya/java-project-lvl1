package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;

public final class Progression implements Game {

    public String description() {
        return "What number is missing in the progression?";
    }
    public String[] questionAndAnswer() {
        final int convert = 25;
        final int convertForDifference = 10;
        int startNum = (int) (Math.random() * convert);
        int difference = (int) (Math.random() * convertForDifference);
        final int length = 10;
        int answerPosition = new Random().nextInt(length);
        String answer = "";
        String[] progression = new String[length];

        int temp = startNum;

        for (int i = 0; i < length; i++) {
            if (answerPosition == i) {
                progression[i] = "..";
                answer = String.valueOf(temp);
            } else {
                progression[i] = String.valueOf(temp);
            }
            temp += difference;
        }
        return new String[] {String.join(" ", progression), answer};
    }
    public static void game() {
        Game game;
        game = new Progression();
        String name = Cli.greetUser();
        Engine.runGame(game, name);
    }
}
