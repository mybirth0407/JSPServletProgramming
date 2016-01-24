package beans;

/**
 * Created by Yedarm Seong on 2016-01-25.
 */
public class CountBean {
    private int count;

    public CountBean() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}
