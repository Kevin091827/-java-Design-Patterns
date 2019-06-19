package com.kevin.shejimoshi.代理模式.动态代理;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:TargetClass
 * @Description: TODO
 */
public class TargetClass implements Target {

    @Override
    public void targetMethod() {
        System.out.println("目标类实现目标方法");
    }
}
