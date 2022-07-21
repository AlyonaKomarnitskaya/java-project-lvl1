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

        var min = Math.min(randomNum2, randomNum1);
        var newGCD = 0;
        for (var gcd = min; gcd > 0; gcd--) {
            if (randomNum1 % gcd == 0 && randomNum2 % gcd == 0) {
                newGCD += gcd;
            }
        }
        return new String[] {randomNum1 + " " + randomNum2, String.valueOf(newGCD)};
    }
    public static void game() {
        Game game;
        game = new GCD();
        String name = Cli.greetUser();
        Engine.runGame(game, name);
    }
}