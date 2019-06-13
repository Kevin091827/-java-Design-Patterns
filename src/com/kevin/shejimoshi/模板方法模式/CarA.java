package com.kevin.shejimoshi.模板方法模式;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:CarA
 * @Description: TODO
 */
public class CarA extends AbstractCar {

    @Override
    public void start() {
        System.out.println("汽车A正在启动.......");
    }

    @Override
    public void alarm() {
        System.out.println("汽车A正在鸣喇叭.......");
    }

    @Override
    public void stop() {
        System.out.println("汽车A停下.......");
    }

//    @Override
//    public void run() {
//        start();
//        alarm();
//        stop();
//    }
}
