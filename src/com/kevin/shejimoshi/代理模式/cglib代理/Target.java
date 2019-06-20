package com.kevin.shejimoshi.代理模式.cglib代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Target
 * @Description: TODO
 */
public class Target implements ITarget{

    @Override
    public void targetMethod(){
        System.out.println("--------> 目标方法");
    }
}
