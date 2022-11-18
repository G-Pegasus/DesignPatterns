package abstractfactory.factory;

import abstractfactory.impl.Brake;
import abstractfactory.impl.Engine;
import abstractfactory.impl.Tire;

public abstract class CarFactory {
    public abstract Tire getTire();
    public abstract Brake getBrake();
    public abstract Engine getEngine();
}
