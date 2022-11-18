package singleton;

public class StaticMode {
    private StaticMode() {}

    private static class StaticHolder {
        @SuppressWarnings("InstantiationOfUtilityClass")
        private static final StaticMode INSTANCE = new StaticMode();
    }

    public static StaticMode getInstance() {
        return StaticHolder.INSTANCE;
    }
}
