package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.Car;
import com.kevin.shejimoshi.工厂模式.entity.Human;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:AbstractHumanFactory
 * @Description: TODO
 */
public class AbstractHumanFactory extends AbstractFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }

    @Override
    public <T extends Car> T createCar(Class<T> c) {
        return null;
    }
}
