package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
public class GCD implements Game {

    public String description() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String[] questionAndAnswer() {
        int convert = 100;
        int randomNum1 = (int) (Math.random() * convert);
        int randomNum2 = (int) (Math.random() * convert);

        int gcd = 1;
        for (int i = 1; i <= randomNum1 && i <= randomNum2; i++) {
            if (randomNum1 % i == 0 && randomNum2 % i == 0) {
                gcd = i;
            }
        }
        return new String[] {randomNum1 + " " + randomNum2, String.valueOf(gcd)};
    }
    public static void game() {
        Game game;
        game = new GCD();
        String name = Cli.greetUser();
        Engine.runGame(game, name);
    }
}