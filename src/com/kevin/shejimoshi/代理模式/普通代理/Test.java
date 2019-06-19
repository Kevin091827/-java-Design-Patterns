package com.kevin.shejimoshi.代理模式.普通代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        IGamePlay iGamePlay = new GamePlayProxy("kevin");
        iGamePlay.login("kevin","123");
        iGamePlay.killBoss();
        iGamePlay.updateGrade();
    }
}
