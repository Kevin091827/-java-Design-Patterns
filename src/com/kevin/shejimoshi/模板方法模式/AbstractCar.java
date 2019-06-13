package com.kevin.shejimoshi.模板方法模式;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:AbstractCar
 * @Description: TODO
 */
public abstract class AbstractCar {

    //启动汽车
    public abstract void start();
    //汽车鸣喇叭
    public abstract void alarm();
    //汽车停下
    public abstract void stop();
    //汽车发动
  //  public abstract void run();

    //是否开启喇叭
    public abstract boolean isAlarm();

    public void run() {
        start();
        if(isAlarm()){
            alarm();
        }
        stop();
    }
}
