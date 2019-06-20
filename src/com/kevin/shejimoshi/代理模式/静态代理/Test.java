package com.kevin.shejimoshi.代理模式.静态代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {

        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rentHouse();
    }
}
