package com.liml.thread;

/**
 * Created by Administrator on 2016/3/7.
 */
public class MoreBasicThread {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
