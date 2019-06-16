package com.kevin.shejimoshi.建造者模式.test2;


import java.util.ArrayList;

/**
 * @Description:    导演类
 * @Author:         Kevin
 * @CreateDate:     2019/6/17 1:07
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/17 1:07
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public class Director {

    private ModelABuilder modelABuilder = new ModelABuilder();
    private ModelBBuilder modelBBuilder = new ModelBBuilder();
    private ArrayList<String> list = new ArrayList<>();

    public ModelA getModelA1(){
        //clear的动作，以防止数据混乱
        list.clear();
        list.add("start");
        list.add("alarm");
        list.add("engineBoom");
        list.add("stop");
        modelABuilder.setList(list);
        return (ModelA) modelABuilder.getModel();
    }

    public ModelA getModelA2(){
        list.clear();
        list.add("start");
        list.add("engineBoom");
        list.add("alarm");
        list.add("stop");
        modelABuilder.setList(list);
        return (ModelA) modelABuilder.getModel();
    }

    public ModelA getModelA3(){
        list.clear();
        list.add("alarm");
        list.add("start");
        list.add("engineBoom");
        list.add("stop");
        modelABuilder.setList(list);
        return (ModelA) modelABuilder.getModel();
    }

    //同理还可以封装更多......
}
