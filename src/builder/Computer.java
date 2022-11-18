package builder;

public abstract class Computer {
    private String mEngine;
    private String mScreen;
    protected String mOS;

    public Computer() {}

    public void setEngine(String engine) {
        this.mEngine = engine;
    }

    public void setScreen(String screen) {
        this.mScreen = screen;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mEngine='" + mEngine + '\'' +
                ", mScreen='" + mScreen + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
