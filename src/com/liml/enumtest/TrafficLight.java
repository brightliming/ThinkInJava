package com.liml.enumtest;
import static com.liml.enumtest.Signal.*;

/**
 * Created by bright on 16-4-27.
 */

public class TrafficLight {
    Signal color = RED;

    public void change(){
        switch(color){
            case RED: color = GREEN;break;
            case GREEN: color = YELLOW;break;
            case YELLOW: color = RED;break;
        }
    }

    public String toString(){
        return "traffic light is "+color;
    }
    public static void main(String[] args){
        TrafficLight f = new TrafficLight();
        for(int i = 0;i<7;i++){
            System.out.println(f);
            f.change();
        }
    }
}
