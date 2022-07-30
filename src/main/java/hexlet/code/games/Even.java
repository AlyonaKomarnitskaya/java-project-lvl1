package hexlet.code.games;
import hexlet.code.Engine;


public final class Even {

    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static String[] getEvenData() {
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

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAndAnswer[i] = getEvenData();
        }
        Engine.runGame(DESCRIPTION, questionAndAnswer);
    }
}
