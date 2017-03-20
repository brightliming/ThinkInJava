package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base Constructor , i="+i);
    }
    abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {System.out.println("Inside instance initializer");}
            @Override
            void f() {
                System.out.println("in anonymous f()");
            }
        };
    }
    public static void main(String[] args){
        Base base = AnonymousConstructor.getBase(10);
        base.f();
    }
}
