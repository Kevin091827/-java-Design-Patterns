package com.kevin.shejimoshi.单例模式;

import javax.print.Doc;

/**
 * @Description:    饿汉式单例（线程安全）
 * @Author:         Kevin
 * @CreateDate:     2019/6/6 13:34
 * @UpdateUser:     Kevin
 * @UpdateDate:     2019/6/6 13:34
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public class Doctor {

    private static final Doctor doctor = new Doctor();

    private Doctor(){

    }

    public static Doctor getSingletonDoctor(){
        return doctor;
    }
}
