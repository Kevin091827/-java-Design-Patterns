package com.kevin.shejimoshi.工厂模式.factory;

import com.kevin.shejimoshi.工厂模式.entity.BlackHuman;
import com.kevin.shejimoshi.工厂模式.entity.WhiteHuman;
import com.kevin.shejimoshi.工厂模式.entity.YellowHuman;

/**
 * @Description: 简单工厂
 * @Author: Kevin
 * @CreateDate: 2019/6/6 22:02
 * @UpdateUser: Kevin
 * @UpdateDate: 2019/6/6 22:02
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SimpleFactory {

    public static BlackHuman getBlackHuman() {
        return new BlackHuman();
    }

    public static WhiteHuman getWhiteHuman() {
        return new WhiteHuman();
    }

    public static YellowHuman getYellowHuman() {
        return new YellowHuman();
    }
}
