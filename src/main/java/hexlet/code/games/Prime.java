package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime implements Game {

    public String description() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String[] questionAndAnswer() {
        int convert = 100;
        int randomNum = (int) (Math.random() * convert);
        String answer;
        int count = 0;

        if (randomNum < 2) {
            answer = "no";
        }
        if (randomNum == 0) {
            answer = "yes";
        }
        for (int i = 1; i <= randomNum; i++) {
            if (randomNum % i == 0)
                count += 1;
        }
        if (count > 2) {
            answer = "no";
        } else {
            answer = "yes";
        }
        return new String[] {String.valueOf(randomNum), answer};
    }
    public static void game() {
        Game game;
        game = new Prime();
        String name = Cli.greetUser();
        Engine.runGame(game, name);
    }
}