package com.kevin.shejimoshi.建造者模式.test2;

/**
 * @Description:    模型具体实现 --- A模型
 * @Author:         Kevin
 * @CreateDate:     2019/6/17 0:47
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/17 0:47
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public class ModelA extends AbstractModel{

    @Override
    protected void start() {
        System.out.println("---------> A 启动");
    }

    @Override
    protected void alarm() {
        System.out.println("---------> A 鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("---------> A 引擎声");
    }

    @Override
    protected void stop() {
        System.out.println("---------> A 停止");
    }
}
