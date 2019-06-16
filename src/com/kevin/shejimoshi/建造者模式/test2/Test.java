package com.kevin.shejimoshi.建造者模式.test2;

import java.util.ArrayList;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        //根据需要执行指定顺序的操作
        ArrayList<String> list = new ArrayList<>();
        list.add("start");
        list.add("alarm");
        list.add("engineBoom");
        list.add("stop");
        //建造指定模型
        ModelA modelA = new ModelA();
        modelA.setSequence(list);
        modelA.run();

        Director director = new Director();
        director.getModelA1().run();
    }
}
