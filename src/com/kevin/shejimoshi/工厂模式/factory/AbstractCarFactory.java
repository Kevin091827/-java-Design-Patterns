package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.Car;
import com.kevin.shejimoshi.工厂模式.entity.Human;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:AbstractCarFactory
 * @Description: TODO
 */
public class AbstractCarFactory extends AbstractFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        return null;
    }

    @Override
    public <T extends Car> T createCar(Class<T> c) {
        Car car = null;
        try {
            car = (Car) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)car;
    }
}
