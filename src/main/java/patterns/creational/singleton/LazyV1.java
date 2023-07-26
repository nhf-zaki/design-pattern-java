package patterns.creational.singleton;

/**
 * Lazy - improve application performance over Eager
 * Not thread safe
 */
public class LazyV1 {
    public static LazyV1 instance;

    private LazyV1() {
    }

    public static LazyV1 getInstance() {
        if (instance == null) {
            instance = new LazyV1();
        }
        return instance;
    }
}
