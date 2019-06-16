package com.kevin.shejimoshi.建造者模式.test2;

import java.util.ArrayList;

/**
 * @Description:    抽象模型建造者
 * @Author:         Kevin
 * @CreateDate:     2019/6/17 0:58
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/17 0:58
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public abstract class AbstractModelBuilder {

    public abstract AbstractModel getModel();

    public abstract void setList(ArrayList<String> list);
}
