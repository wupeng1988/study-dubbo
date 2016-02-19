package org.singledog.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-19
 * @modify
 * @copyright Navi Tsp
 */
public class Test {

    public static void main(String[] args) {

//        CglibProxyHandler handler = new CglibProxyHandler();
//        PeopleImpl impl = new PeopleImpl();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(impl.getClass());
//        // 回调方法
//        enhancer.setCallback(handler);
//        // 创建代理对象
//        impl = (PeopleImpl) enhancer.create();
//        impl.speak();


        CglibProxyHandler handler = new CglibProxyHandler();
        PeopleImpl impl = (PeopleImpl) handler.getInstance(new PeopleImpl());
        impl.speak();

    }

}
