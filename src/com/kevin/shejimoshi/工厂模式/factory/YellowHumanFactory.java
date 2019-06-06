package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.Human;
import com.kevin.shejimoshi.工厂模式.entity.YellowHuman;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:YellowHuman
 * @Description: TODO
 */
public class YellowHumanFactory implements HumanFactory {

    @Override
    public Human getHuman() {
        return new YellowHuman();
    }
}
