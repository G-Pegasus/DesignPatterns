package factory;

import factory.car.AudiCar;
import factory.car.BMWCar;
import factory.car.BenzCar;

public class CarFactory1 {

    public Car getCar(String carType) {
        return switch (carType) {
            case "AUDICAR" -> new AudiCar();
            case "BMWCAR" -> new BMWCar();
            case "BENZCAR" -> new BenzCar();
            default -> null;
        };
    }
}
