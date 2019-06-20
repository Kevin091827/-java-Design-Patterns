package com.kevin.shejimoshi.代理模式.静态代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Host
 * @Description: TODO
 */
public class Host implements Rent {

    @Override
    public void rentHouse() {
        System.out.println("-------> 房东出租房子");
    }
}
