package abstractfactory.factory;

import abstractfactory.components.ImportedEngine;
import abstractfactory.components.NormalBrake;
import abstractfactory.components.OffRoadTire;
import abstractfactory.impl.Brake;
import abstractfactory.impl.Engine;
import abstractfactory.impl.Tire;

public class BMWFactory extends CarFactory {
    @Override
    public Tire getTire() {
        return new OffRoadTire();
    }

    @Override
    public Brake getBrake() {
        return new NormalBrake();
    }

    @Override
    public Engine getEngine() {
        return new ImportedEngine();
    }
}
