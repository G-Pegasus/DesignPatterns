package builder;

public interface ComputerBuilder {
    ComputerBuilder buildEngine(String engine);
    ComputerBuilder buildScreen(String screen);
    ComputerBuilder buildOS();
    Computer create();
}
