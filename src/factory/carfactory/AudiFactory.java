package factory.carfactory;

import factory.Car;
import factory.CarFactory;
import factory.car.AudiCar;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
