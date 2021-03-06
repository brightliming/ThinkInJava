package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/31.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        this.eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
