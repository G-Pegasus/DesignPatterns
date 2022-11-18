package abstractfactory.components;

import abstractfactory.impl.Engine;

public class ImportedEngine implements Engine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
