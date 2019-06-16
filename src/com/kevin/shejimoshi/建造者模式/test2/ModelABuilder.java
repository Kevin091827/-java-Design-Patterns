package com.kevin.shejimoshi.建造者模式.test2;

import java.util.ArrayList;

/**
 * @Description:    模型A建造者
 * @Author:         Kevin
 * @CreateDate:     2019/6/17 1:05
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/17 1:05
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public class ModelABuilder extends AbstractModelBuilder {

    private ModelA modelA = new ModelA();

    @Override
    public AbstractModel getModel() {
        return modelA;
    }

    @Override
    public void setList(ArrayList<String> list) {
        modelA.setSequence(list);
    }
}
