package abstractfactory.components;

import abstractfactory.impl.Brake;

public class NormalBrake implements Brake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
