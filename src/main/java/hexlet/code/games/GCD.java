package hexlet.code.games;
import hexlet.code.Engine;
public final class GCD {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static String[] getGcdData() {
        final int convert = 100;
        int randomNum1 = (int) (Math.random() * convert);
        int randomNum2 = (int) (Math.random() * convert);

        var min = Math.min(randomNum2, randomNum1);

        for (var gcd = min; gcd > 0; gcd--) {
            if ((randomNum1 % gcd == 0) && (randomNum2 % gcd == 0)) {
                return new String[] {randomNum1 + " " + randomNum2, String.valueOf(gcd)};
            }
        }
        return null;
    }
    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAndAnswer[i] = getGcdData();
        }
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
}
