package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public final class Even implements Game {

    public String description() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
    public String[] questionAndAnswer() {
        final int convert = 100;
        int randomNum = (int) (Math.random() * convert);
        String answer;
        if (randomNum % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[] {String.valueOf(randomNum), answer};
    }

    public static void game() {
        Game game;
        game = new Even();
        String name = Cli.greetUser();
        Engine.runGame(game, name);
    }
}
