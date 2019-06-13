package com.kevin.shejimoshi.单例模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description: 特殊的'单例'
 * @Author: Kevin
 * @CreateDate: 2019/6/6 14:13
 * @UpdateUser: Kevin
 * @UpdateDate: 2019/6/6 14:13
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SpecialSingleton {

    //对象数量
    private static int singletonSum = 3;

    //对象容器
    private static ArrayList<SpecialSingleton> list = new ArrayList<>();

    static {
        for (int i = 0; i < singletonSum; i++) {
            list.add(new SpecialSingleton());
        }
    }

    /**
     * 从容器获取对象
     *
     * @return
     */
    public static SpecialSingleton getInstance() {
        //随机从容器获取一个对象
        return list.get(new Random().nextInt(singletonSum));
    }
}
