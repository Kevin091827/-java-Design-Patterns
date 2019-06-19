package com.kevin.shejimoshi.代理模式.强制代理;

import com.kevin.shejimoshi.代理模式.普通代理.GamePlay;
import com.kevin.shejimoshi.代理模式.普通代理.GamePlayProxy;
import com.kevin.shejimoshi.代理模式.普通代理.IGamePlay;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        GamePlay2 gamePlay2 = new GamePlay2("kevin");
        IGamePlay2 proxy = gamePlay2.getProxy();
        proxy.login("kevin","123");
        proxy.killBoss();
        proxy.updateGrade();
    }
}
