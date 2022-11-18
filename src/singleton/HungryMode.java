package singleton;

public class HungryMode {

    @SuppressWarnings("InstantiationOfUtilityClass")
    private static final HungryMode INSTANCE = new HungryMode();

    public HungryMode() {}

    public static HungryMode getInstance() {
        return INSTANCE;
    }
}
