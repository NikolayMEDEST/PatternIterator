import java.util.*;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

       protected Random random;
       int max;
       int min;

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
                while (true) {
                    return random.nextInt(max - min) + min;
                }
            }
        };
    }
}