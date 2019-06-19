package com.kevin.shejimoshi.代理模式.普通代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:GamePlayProxy
 * @Description: TODO
 */
public class GamePlayProxy implements IGamePlay {

    private IGamePlay iGamePlay = null;

    public GamePlayProxy(String name){
        try {
            iGamePlay = new GamePlay(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
       this.iGamePlay.login("kevin","23");
    }

    @Override
    public void killBoss() {
        this.iGamePlay.killBoss();
    }

    @Override
    public void updateGrade() {
        this.iGamePlay.updateGrade();
    }
}
