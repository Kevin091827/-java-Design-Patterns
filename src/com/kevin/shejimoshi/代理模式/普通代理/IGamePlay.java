package com.kevin.shejimoshi.代理模式.普通代理;

/**
 * @Auther: Kevin
 * @Date:
 * @InterfaceName:IGamePlay
 * @Description: TODO
 */
public interface IGamePlay {

    //登录游戏
    void login(String user,String password);

    //杀怪
    void killBoss();

    //升级
    void updateGrade();
}
