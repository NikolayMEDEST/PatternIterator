import java.util.*;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    private int max;
    private int min;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min) + min;
            }
        };
    }
}