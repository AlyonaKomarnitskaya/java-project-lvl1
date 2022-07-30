package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public final class Calc {
    static final String DESCRIPTION = "What is the result of the expression?";
    public static char randomOperator() {
        char[] operators = {'*', '+', '-'};
        int operator = new Random().nextInt(operators.length);
        return operators[operator];
    }

    public static String[] getCalcData() {
        final int convert = 100;
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
    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAndAnswer[i] = getCalcData();
        }
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
}
