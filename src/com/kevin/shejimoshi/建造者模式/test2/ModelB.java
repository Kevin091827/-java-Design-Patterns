package com.kevin.shejimoshi.建造者模式.test2;

/**
 * @Description:    模型具体实现 --- B模型
 * @Author:         Kevin
 * @CreateDate:     2019/6/17 0:47
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/17 0:47
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public class ModelB extends AbstractModel{

    @Override
    protected void start() {
        System.out.println("---------> B 启动");
    }

    @Override
    protected void alarm() {
        System.out.println("---------> B 鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("---------> B 引擎声响起");
    }

    @Override
    protected void stop() {
        System.out.println("---------> B 停止");
    }
}
