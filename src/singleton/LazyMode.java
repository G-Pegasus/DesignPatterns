package singleton;

public class LazyMode {
    private static LazyMode INSTANCE;

    public LazyMode() {}

    // 非线程安全
    public LazyMode getInstance1() {
        if (INSTANCE == null) {
            INSTANCE = new LazyMode();
        }

        return INSTANCE;
    }

    // 线程安全
    public static synchronized LazyMode getInstance2() {
        if (INSTANCE == null) {
            INSTANCE = new LazyMode();
        }
        return INSTANCE;
    }
}
