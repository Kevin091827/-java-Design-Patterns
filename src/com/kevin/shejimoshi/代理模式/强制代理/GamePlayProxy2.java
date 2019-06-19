package com.kevin.shejimoshi.代理模式.强制代理;

import com.kevin.shejimoshi.代理模式.普通代理.GamePlayProxy;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:GamePlayProxy2
 * @Description: TODO
 */
public class GamePlayProxy2 implements IGamePlay2 {

    private IGamePlay2 iGamePlay2 = null;

    public GamePlayProxy2(IGamePlay2 iGamePlay2){
        this.iGamePlay2 = iGamePlay2;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlay2.login(user, password);
    }

    @Override
    public void killBoss() {
        this.iGamePlay2.killBoss();
    }

    @Override
    public void updateGrade() {
        this.iGamePlay2.updateGrade();
    }

    @Override
    public IGamePlay2 getProxy() {
        return this;
    }
}
