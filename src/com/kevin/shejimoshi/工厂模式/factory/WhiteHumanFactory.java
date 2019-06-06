package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.Human;
import com.kevin.shejimoshi.工厂模式.entity.WhiteHuman;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:WhiteHumanFactory
 * @Description: TODO
 */
public class WhiteHumanFactory implements HumanFactory {

    @Override
    public Human getHuman() {
        return new WhiteHuman();
    }
}
