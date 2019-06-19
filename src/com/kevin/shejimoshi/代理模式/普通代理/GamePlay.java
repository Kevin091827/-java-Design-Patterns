package com.kevin.shejimoshi.代理模式.普通代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:GamePlay
 * @Description: TODO
 */
public class GamePlay implements IGamePlay {

    private String name = "";

    //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlay(IGamePlay iGamePlay , String name) throws Exception {
        if(iGamePlay == null){
            throw new Exception("iGamePlay is null");
        }else{
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println(this.name+"登录游戏");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪");
    }

    @Override
    public void updateGrade() {
        System.out.println(this.name+"升级");
    }
}
