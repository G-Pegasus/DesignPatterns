package factory.car;

import factory.Car;

public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println("驾驶奔驰汽车");
    }
}
