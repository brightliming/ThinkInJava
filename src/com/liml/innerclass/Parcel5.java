package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            public PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] arg){
        Parcel5 parcel = new Parcel5();
        Destination destination = parcel.destination("beijing");
        System.out.println(destination.readLabel());
    }
}
