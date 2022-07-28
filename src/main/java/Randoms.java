import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;


    public Randoms(int min, int max) {
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
                return min + (int)(Math.random() * ((max - min) + 1));
            }
        };
    }
}
