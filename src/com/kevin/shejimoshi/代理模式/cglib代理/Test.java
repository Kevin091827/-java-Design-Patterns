package com.kevin.shejimoshi.代理模式.cglib代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        Target target = (Target) proxy.getProxy(ITarget.class);
        target.targetMethod();
    }
}
