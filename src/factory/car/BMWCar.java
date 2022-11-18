package factory.car;

import factory.Car;

public class BMWCar implements Car {
    @Override
    public void drive() {
        System.out.println("驾驶宝马汽车");
    }
}
