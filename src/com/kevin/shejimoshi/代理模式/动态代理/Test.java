package com.kevin.shejimoshi.代理模式.动态代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Target target = ProxyClass.createProxy();
        target.targetMethod();
    }
}
