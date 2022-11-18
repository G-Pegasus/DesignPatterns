package abstractfactory.components;

import abstractfactory.impl.Tire;

public class NormalTire implements Tire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
