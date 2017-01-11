package com.liml.thread;

/**
 * Created by Administrator on 2016/3/7.
 */
public class BasicThread {
    public static void main(String[] args){
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
