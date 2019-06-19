package com.kevin.shejimoshi.代理模式.动态代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Aspect
 * @Description: TODO
 */
public class Aspect {

    public void before() {
        System.out.println("前方法");
    }

    public void after() {
        System.out.println("后方法");
    }
}
