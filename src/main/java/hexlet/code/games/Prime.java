package hexlet.code.games;
import hexlet.code.Engine;

public final class Prime {

    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[] getPrimeData() {
        final int convert = 100;
        int randomNum = (int) (Math.random() * convert);

        if ((randomNum == 0)  || (randomNum == 1)) {
            return new String[] {String.valueOf(randomNum), "yes"};
        }

        String answer;
        int count = 0;
        for (int i = 1; i <= randomNum; i++) {
            if (randomNum % i == 0) {
                count += 1;
            }
        }
        if (count > 2) {
            answer = "no";
        } else {
            answer = "yes";
        }
        return new String[] {String.valueOf(randomNum), answer};
    }
    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAndAnswer[i] = getPrimeData();
        }
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
}
