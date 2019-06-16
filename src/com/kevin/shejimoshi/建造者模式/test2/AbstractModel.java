package com.kevin.shejimoshi.建造者模式.test2;

import java.util.ArrayList;

/**
 * @Description:    抽象模型
 * @Author:         Kevin
 * @CreateDate:     2019/6/17 0:44
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/17 0:44
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public abstract class AbstractModel {

    //执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    public void run(){

        //根据执行顺序执行方法，组合成run方法
        for(int i=0;i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
                //启动汽车
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
                //停止汽车
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
                //喇叭开始叫了
            }else if(actionName.equalsIgnoreCase("engineBoom")){
                //如果是engine boom关键
                this.engineBoom();
                //引擎开始轰鸣
            }
        }
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
