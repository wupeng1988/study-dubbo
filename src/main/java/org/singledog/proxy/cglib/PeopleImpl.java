package org.singledog.proxy.cglib;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-19
 * @modify
 * @copyright Navi Tsp
 */
public class PeopleImpl implements People {
    @Override
    public void speak() {
        System.out.println(">>>><<<<<");
    }
}
