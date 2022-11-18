package abstractfactory.components;

import abstractfactory.impl.Engine;

public class NormalEngine implements Engine {
    @Override
    public void engine() {
        System.out.println("普通发动机");
    }
}
