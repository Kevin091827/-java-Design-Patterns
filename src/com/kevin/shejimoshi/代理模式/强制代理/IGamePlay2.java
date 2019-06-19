package com.kevin.shejimoshi.代理模式.强制代理;

/**
 * @Auther: Kevin
 * @Date:
 * @InterfaceName:IGamePlay2
 * @Description: TODO
 */
public interface IGamePlay2 {
    //登录游戏
    void login(String user,String password);

    //杀怪
    void killBoss();

    //升级
    void updateGrade();

    //每个人都可以找一下自己的代理
    IGamePlay2 getProxy();
}
