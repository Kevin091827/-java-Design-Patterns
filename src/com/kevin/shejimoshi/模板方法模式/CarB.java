package com.kevin.shejimoshi.模板方法模式;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:CarB
 * @Description: TODO
 */
public class CarB extends AbstractCar {

    @Override
    public void start() {
        System.out.println("汽车B正在启动.......");
    }

    @Override
    public void alarm() {
        System.out.println("汽车B正在鸣喇叭.......");
    }

    @Override
    public void stop() {
        System.out.println("汽车B停下.......");
    }

//    @Override
//    public void run() {
//        start();
//        alarm();
//        stop();
//    }
}

