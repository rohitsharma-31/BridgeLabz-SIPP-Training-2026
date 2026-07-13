import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Repository<T> {
    private final List<T> storage = new ArrayList<>();

    public void add(T item) { storage.add(item); }

    public boolean remove(T item) { return storage.remove(item); }

    public List<T> getAll() { return new ArrayList<>(storage); }

    public List<T> find(Predicate<? super T> predicate) {
        List<T> res = new ArrayList<>();
        for (T t : storage) if (predicate.test(t)) res.add(t);
        return res;
    }
}
