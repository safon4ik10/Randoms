import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected PrimitiveIterator.OfInt random;

    public Randoms(int min, int max) {
        this.random = new Random().ints(min, max + 1).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return random.hasNext();
            }

            @Override
            public Integer next() {
                if (!random.hasNext()) {
                    throw new NoSuchElementException();
                }
                return random.nextInt();
            }
        };
    }
}
