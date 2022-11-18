package abstractfactory.factory;

import abstractfactory.components.ImportedEngine;
import abstractfactory.components.NormalBrake;
import abstractfactory.components.NormalTire;
import abstractfactory.impl.Brake;
import abstractfactory.impl.Engine;
import abstractfactory.impl.Tire;

public class BenzFactory extends CarFactory {
    @Override
    public Tire getTire() {
        return new NormalTire();
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
