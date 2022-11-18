package factory.carfactory;

import factory.Car;
import factory.CarFactory;
import factory.car.BenzCar;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BenzCar();
    }
}
