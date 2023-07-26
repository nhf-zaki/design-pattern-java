package patterns.creational.singleton;

/**
 * Lazy - locking double check, synchronized block
 */
public class LazyV3 {
    public static volatile LazyV3 instance;

    private LazyV3() {

    }

    public static LazyV3 getInstance() {
        if (instance == null) {
            synchronized (LazyV3.class) {
                if (instance == null) {
                    instance = new LazyV3();
                }
            }
        }
        return instance;
    }
}
