package abstractfactory.components;

import abstractfactory.impl.Brake;

public class SeniorBrake implements Brake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
