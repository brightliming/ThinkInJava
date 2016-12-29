package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/29.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        public void howdy() {
            System.out.println("HowDy!");
        }
        public static void main(String[] args){
            new Test().howdy();
        }
    }
}
