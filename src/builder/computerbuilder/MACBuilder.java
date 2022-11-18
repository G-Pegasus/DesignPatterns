package builder.computerbuilder;

import builder.Computer;
import builder.ComputerBuilder;
import builder.computer.MAC;

public class MACBuilder implements ComputerBuilder {
    Computer mComputer = new MAC();

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
