package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public final class Progression {

    static final String DESCRIPTION = "What number is missing in the progression?";
    public static String[] getProgressionData() {
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
    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAndAnswer[i] = getProgressionData();
        }
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
}
