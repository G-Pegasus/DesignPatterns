package factory;

import factory.carfactory.AudiFactory;
import factory.carfactory.BMWFactory;
import factory.carfactory.BenzFactory;

public class FactoryTest {

    public static void main(String[] args) {
        CarFactory bmwFactory = new BMWFactory();
        CarFactory benzFactory = new BenzFactory();
        CarFactory audiFactory = new AudiFactory();

        Car bmwCar = bmwFactory.createCar();
        Car benzCar = benzFactory.createCar();
        Car audiCar = audiFactory.createCar();

        bmwCar.drive();
        benzCar.drive();
        audiCar.drive();

        CarFactory1 factory1 = new CarFactory1();
        Car bmwCar1 = factory1.getCar("BMWCAR");
        Car benzCar1 = factory1.getCar("BENZCAR");
        Car audiCar1 = factory1.getCar("AUDICAR");

        bmwCar1.drive();
        benzCar1.drive();
        audiCar1.drive();
    }
}
