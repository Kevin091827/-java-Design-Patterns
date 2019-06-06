package com.kevin.shejimoshi.单例模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:    登记单例
 * @Author:         Kevin
 * @CreateDate:     2019/6/6 13:53
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/6 13:53
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public class Person {

    // 单例容器
    private static Map<String,Person> map = new HashMap<>();

    // 构造方法私有化
    private Person(){

    }

    static {
        Person person = new Person();
        map.put(person.getClass().getName(),person);
    }

    /**
     * 从容器中获取单例对象
     * @param name
     * @return
     */
    public static Person getInstanceFromMap(String name){
        //根据指定的类的名称从map中获取实例并返回
        return map.get(name);
    }
}
