package abstractfactory.components;

import abstractfactory.impl.Tire;

public class OffRoadTire implements Tire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
