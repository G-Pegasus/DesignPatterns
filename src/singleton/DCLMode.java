package singleton;

public class DCLMode {
    private volatile static DCLMode INSTANCE;

    public DCLMode() {}

    public static DCLMode getInstance() {
        if (INSTANCE == null) {
            synchronized (DCLMode.class) {
                if (INSTANCE == null) {
                    //noinspection InstantiationOfUtilityClass
                    INSTANCE = new DCLMode();
                }
            }
        }

        return INSTANCE;
    }
}
