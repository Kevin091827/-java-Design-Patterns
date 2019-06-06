package com.kevin.shejimoshi.单例模式;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Test
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        // write your code here
        Student s1 = Student.getSingletonStudent();
        Student s2 = Student.getSingletonStudent();
        System.out.println(s1 == s2);
    }

}
