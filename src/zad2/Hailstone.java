package zad2;

import java.util.Iterator;

public class Hailstone implements Iterator<Integer>, Iterable<Integer> {

    private Integer numberOfSteps;
    private Integer last = 0;

    public Hailstone(Integer initialization) {
        this.numberOfSteps = initialization;
    }

    @Override
    public boolean hasNext() {
        if (numberOfSteps != 1) {

            return true;
        } else if (numberOfSteps == 1) {
            numberOfSteps++;
            last++;
            if (last == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer next() {

        if (numberOfSteps % 2 == 0) {
            numberOfSteps /= 2;
            return numberOfSteps;
        } else if (numberOfSteps % 2 != 0) {
            numberOfSteps = 3 * numberOfSteps + 1;
            return numberOfSteps;
        }
        return null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }
}