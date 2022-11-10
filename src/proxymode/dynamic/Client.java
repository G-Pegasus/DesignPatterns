package proxymode.dynamic;

import proxymode.IRoom;
import proxymode.TongJi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        // 被代理人
        TongJi tongji = new TongJi();
        DynamicProxy proxy = new DynamicProxy(tongji);

        // 找到一个类加载器
        ClassLoader loader = tongji.getClass().getClassLoader();

        // 这是一步构造，就不用创建 DynamicProxy类了
//        IRoom agent = (IRoom) Proxy.newProxyInstance(loader, new Class[]{IRoom.class},
//                (proxy1, method, args1) -> method.invoke(tongji, args1));

        IRoom agent = (IRoom) Proxy.newProxyInstance(loader, new Class[]{IRoom.class}, proxy);

        // 代理人帮忙找房
        agent.findHouse();
        agent.watchHouse();
        agent.rent();
        agent.finish();
    }
}
