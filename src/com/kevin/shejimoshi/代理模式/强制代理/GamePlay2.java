package com.kevin.shejimoshi.代理模式.强制代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:GamePlay2
 * @Description: TODO
 */
public class GamePlay2 implements IGamePlay2 {

    private String name = "";

    private GamePlayProxy2 proxy = null;

    public GamePlay2(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if(isProxy()) {
            System.out.println(this.name+"登录游戏");
        }else {
            System.out.println("无代理");
        }
    }

    @Override
    public void killBoss() {
        if(isProxy()) {
            System.out.println(this.name+"在打怪");
        }else {
            System.out.println("无代理");
        }
    }

    @Override
    public void updateGrade() {
        if(isProxy()) {
            System.out.println(this.name + "升级");
        }else {
            System.out.println("无代理");
        }
    }

    @Override
    public IGamePlay2 getProxy() {
        this.proxy = new GamePlayProxy2(this);
        return this.proxy;
    }

    //校验是否是代理访问
     private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
