package factory.carfactory;

import factory.CarFactory;
import factory.car.BMWCar;

public class BMWFactory implements CarFactory {
    @Override
    public BMWCar createCar() {
        return new BMWCar();
    }
}
