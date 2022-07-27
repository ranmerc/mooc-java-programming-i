
/**
 *
 * @author ranmerc
 */
public class Timer {

    private ClockHand hundrethOfASecond;
    private ClockHand second;

    public Timer() {
        this.hundrethOfASecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public String toString() {
        return this.second + ":" + this.hundrethOfASecond;
    }

    public void advance() {
        this.hundrethOfASecond.advance();

        if (this.hundrethOfASecond.value() == 0) {
            this.second.advance();
        }
    }
}
