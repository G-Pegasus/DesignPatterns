package proxymode;

public class TongJi implements IRoom {

    @Override
    public void findHouse() {
        System.out.println("我要找房");
    }

    @Override
    public void watchHouse() {
        System.out.println("我要看房");
    }

    @Override
    public void rent() {
        System.out.println("我要租房");
    }

    @Override
    public void finish() {
        System.out.println("租到房了");
    }
}
