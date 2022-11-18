package abstractfactory;

import abstractfactory.factory.AudiFactory;
import abstractfactory.factory.BMWFactory;
import abstractfactory.factory.BenzFactory;
import abstractfactory.factory.CarFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        CarFactory bmwFactory = new BMWFactory();
        bmwFactory.getBrake().brake();
        bmwFactory.getEngine().engine();
        bmwFactory.getTire().tire();

        CarFactory benzFactory = new BenzFactory();
        benzFactory.getBrake().brake();
        benzFactory.getEngine().engine();
        benzFactory.getTire().tire();

        CarFactory audiFactory = new AudiFactory();
        audiFactory.getBrake().brake();
        audiFactory.getEngine().engine();
        audiFactory.getTire().tire();
    }
}
