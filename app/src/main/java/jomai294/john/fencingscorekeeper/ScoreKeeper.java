package jomai294.john.fencingscorekeeper;

/**
 * Created by John on 9/12/17.
 */

public class ScoreKeeper {
    private int scoreLeft;
    private int scoreRight;
    private String leftName;
    private String rightName;
    private boolean halt = false;
    private int yellowCount;
    private int redCount;
    private int minutes;
    private int seconds;
    private int milliseconds;

    public void setMinutes(int min) {

        minutes = min;
    }

    public int getMinutes() {

        return minutes;
    }

    public void setMilliseconds(int milli) {

        milliseconds = milli;
    }

    public int getMilliseconds() {

        return milliseconds;
    }

    public void setSeconds(int sec) {
        seconds = sec;
    }

    public int getSeconds() {
        return seconds;
    }


    public void setScoreLeft(int score) {

        scoreLeft = score;
    }
    public int getScoreLeft() {

        return scoreLeft;
    }
    public void setScoreRight(int score) {

        scoreRight = score;
    }
    public int getScoreRight() {

        return scoreRight;
    }
    public void setLeftName(String name) {

        leftName = name;
    }
    public String getLeftName() {

        return leftName;
    }
    public void setRightName(String name) {

        rightName = name;
    }
    public void leftScore() {

        scoreLeft++;
    }
    public void decLeftScore() {

        scoreLeft--;
    }
    public void rightScore() {

        scoreRight++;
    }
    public void decRightScore() {

        scoreRight--;
    }
    public void setHalt(boolean value) {

        value = halt;
    }
    public boolean getHalt() {

        return halt;
    }
    public void reset() {

        new ScoreKeeper();
    }

    public ScoreKeeper() {
        scoreLeft = 0;
        scoreRight = 0;
        leftName = "";
        rightName = "";
        yellowCount = 0;
        redCount = 0;
    }
    public static void main(String[] args) {
        ScoreKeeper sk = new ScoreKeeper();
        sk.leftScore();
        System.out.println(sk.getScoreLeft());
        sk.rightScore();
        
    }
}
