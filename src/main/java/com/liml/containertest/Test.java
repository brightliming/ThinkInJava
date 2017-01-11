package com.liml.containertest;

/**
 * Created by bright on 16-5-24.
 */
public abstract class Test<C> {
    String name;
    public Test(String name){
        this.name = name;
    }
    abstract int test(C container,TestParam tp);
}
