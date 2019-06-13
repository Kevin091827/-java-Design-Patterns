package com.kevin.shejimoshi.单例模式;

/**
 * @Description: 懒汉式单例
 * @Author: Kevin
 * @CreateDate: 2019/6/6 13:22
 * @UpdateUser: Kevin
 * @UpdateDate: 2019/6/6 13:22
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class Student {

    private static Student student = null;

    //构造方法私有化
    private Student() {

    }

    /**
     * 全局静态方法
     * <p>
     * 饿汉式单例在高并发下可能会出现多实例
     *
     * @return
     */
    public synchronized static Student getSingletonStudent1() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    /********************** 解决方法 *******************************/

    /**
     * 1.懒汉式单例，同步方法（直接方法上锁，效率低）
     *
     * @return
     */
    public synchronized static Student getSingletonStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    /**
     * 2.双重检查（dcl）  --- 方法内部加锁（性能好于 getSingletonStudent()）
     *
     * @return
     */
    public static Student getStudent() {
        if (student == null) {
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }

    /**
     * 3.基于静态内部类实现
     */
    private static class Lazy {
        private static final Student student = new Student();
    }

    /**
     * 内部类 Lazy只有在getInstance()方法第一次调用的时候才会被加载（实现了延迟加载效果）
     * 而且其加载过程是线程安全的（实现线程安全）
     *
     * @return
     */
    public static Student getInstance() {
        return Lazy.student;
    }

}
