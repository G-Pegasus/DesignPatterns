package abstractfactory.factory;

import abstractfactory.components.ImportedEngine;
import abstractfactory.components.NormalTire;
import abstractfactory.components.SeniorBrake;
import abstractfactory.impl.Brake;
import abstractfactory.impl.Engine;
import abstractfactory.impl.Tire;

public class AudiFactory extends CarFactory {
    @Override
    public Tire getTire() {
        return new NormalTire();
    }

    @Override
    public Brake getBrake() {
        return new SeniorBrake();
    }

    @Override
    public Engine getEngine() {
        return new ImportedEngine();
    }
}
