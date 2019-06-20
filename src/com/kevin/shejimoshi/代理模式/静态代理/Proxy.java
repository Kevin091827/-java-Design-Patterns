package com.kevin.shejimoshi.代理模式.静态代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Proxy
 * @Description: TODO
 */
public class Proxy implements Rent {

    private Rent rent;

    public Proxy(Rent rent){
        this.rent = rent;
    }

    @Override
    public void rentHouse() {
        rent.rentHouse();
    }
}
