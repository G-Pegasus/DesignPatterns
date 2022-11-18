package factory.car;

import factory.Car;

public class AudiCar implements Car {
    @Override
    public void drive() {
        System.out.println("驾驶奥迪汽车");
    }
}
