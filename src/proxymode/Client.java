package proxymode;

public class Client {

    public static void main(String[] args) {
        TongJi tongji = new TongJi();
        HouseAgent agent = new HouseAgent(tongji);

        // 代理人帮我找房
        agent.findHouse();
        agent.watchHouse();
        agent.rent();
        agent.finish();
    }
}
