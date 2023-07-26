package patterns.creational.singleton;

public class LazyV2 {
    public static volatile LazyV2 instance;

    private LazyV2() {

    }

    public static synchronized LazyV2 getInstance() {
        if (instance == null) {
            instance = new LazyV2();
        }
        return instance;
    }
}
