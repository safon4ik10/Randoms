import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private List<Integer> list;

    public Randoms(int min, int max) {
        this.random = new Random();
        list = IntStream.range(min, max + 1).boxed().collect(Collectors.toList());
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return list.size() > 0;
            }

            @Override
            public Integer next() {
                int size = list.size();
                if (size == 0) {
                    throw new NoSuchElementException();
                }
                int id = (int) (Math.random() * size);
                return list.get(id);
            }
        };
    }
}
