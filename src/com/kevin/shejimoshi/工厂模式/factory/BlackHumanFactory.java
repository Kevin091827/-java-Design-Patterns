package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.BlackHuman;
import com.kevin.shejimoshi.工厂模式.entity.Human;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:BlackHumanFactory
 * @Description: TODO
 */
public class BlackHumanFactory implements HumanFactory {

    @Override
    public Human getHuman() {
        return new BlackHuman();
    }
}
