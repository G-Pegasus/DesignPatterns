package builder;

import builder.computer.MAC;
import builder.computer.ROG;
import builder.computerbuilder.MACBuilder;
import builder.computerbuilder.ROGBuilder;

public class BuilderTest {

    public static void main(String[] args) {
        ComputerBuilder builder = new ROGBuilder();
        ROG rog = (ROG) builder
                .buildEngine("AMD R9 6900HX")
                .buildScreen("2K 165HZ")
                .buildOS()
                .create();

        ComputerBuilder builder1 = new MACBuilder();
        MAC mac = (MAC) builder1
                .buildEngine("M2")
                .buildScreen("2K 90HZ")
                .buildOS()
                .create();

        System.out.println(rog.toString());
        System.out.println(mac.toString());
    }
}
