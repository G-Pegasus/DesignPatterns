package builder.computerbuilder;

import builder.Computer;
import builder.ComputerBuilder;
import builder.computer.ROG;

public class ROGBuilder implements ComputerBuilder {
    Computer mComputer = new ROG();

    @Override
    public ComputerBuilder buildEngine(String engine) {
        mComputer.setEngine(engine);
        return this;
    }

    @Override
    public ComputerBuilder buildScreen(String screen) {
        mComputer.setScreen(screen);
        return this;
    }

    @Override
    public ComputerBuilder buildOS() {
        mComputer.setOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
