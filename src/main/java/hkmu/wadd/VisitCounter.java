package hkmu.wadd;

import java.io.Serializable;

public class VisitCounter implements Serializable {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
