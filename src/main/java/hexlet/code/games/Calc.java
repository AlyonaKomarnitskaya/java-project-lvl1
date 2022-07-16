package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;

public class Calc implements Game {
    public String description() {
        return "What is the result of the expression?";
    }

    public static char randomOperator() {
        char[] operators = {'*', '+', '-'};
        int operator = new Random().nextInt(operators.length);
        return operators[operator];
    }

    public String[] questionAndAnswer() {
        int convert = 100;
        int randomNum1 = (int) (Math.random() * convert);
        int randomNum2 = (int) (Math.random() * convert);
        char operator = randomOperator();
        int result = 0;
        switch (operator) {
            case '+':
                result = randomNum1 + randomNum2;
                break;
            case '-':
                result = randomNum1 - randomNum2;
                break;
            case '*':
                result = randomNum1 * randomNum2;
                break;
            default:
                break;
        }
        return new String[] {randomNum1 + " " + operator + " " + randomNum2, String.valueOf(result)};
    }
    public static void game() {
        Game game;
        game = new Calc();
        String name = Cli.greetUser();
        Engine.runGame(game, name);
    }
}