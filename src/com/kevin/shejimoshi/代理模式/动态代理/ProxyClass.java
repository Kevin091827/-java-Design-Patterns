package com.kevin.shejimoshi.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Kevin
 * @Date:
 * @ClassName:ProxyClass
 * @Description: TODO
 */
public class ProxyClass {

    public static Target createProxy(){
        final Target targetClass = new TargetClass();

        final Aspect aspect = new Aspect();

        Target proxy = (Target) Proxy.newProxyInstance(ProxyClass.class.getClassLoader(), targetClass.getClass().getInterfaces(),new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               aspect.before();

               Object result = method.invoke(targetClass,args);

               aspect.after();

               return result;
            }
        });
        return proxy;
    }
}
