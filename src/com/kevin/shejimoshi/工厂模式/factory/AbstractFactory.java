package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.Car;
import com.kevin.shejimoshi.工厂模式.entity.Human;

/**
 * @Description: 抽象工厂
 * @Author: Kevin
 * @CreateDate: 2019/6/6 22:03
 * @UpdateUser: Kevin
 * @UpdateDate: 2019/6/6 22:03
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public abstract class AbstractFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);

    public abstract <T extends Car> T createCar(Class<T> c);
}
