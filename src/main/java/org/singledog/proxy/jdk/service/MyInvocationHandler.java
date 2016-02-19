package org.singledog.proxy.jdk.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-19
 * @modify
 * @copyright Navi Tsp
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        System.out.println("jdk proxy.. before..>>>");
        Object obj = method.invoke(target, args);
        System.out.println("jdk proxy.. after..>>>");
        return obj;
    }
}
