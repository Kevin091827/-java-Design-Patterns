package com.kevin.shejimoshi.代理模式.cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:Proxy
 * @Description: TODO
 */
public class Proxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置代理");
        //通过代理类调用父类中的方法
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("后置代理");
        return result;
    }
}
