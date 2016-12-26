package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Parcel10 {
    public Destination destination(final String dest,final float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100){
                    System.out.println("Over Budget");
                }
            }
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args){
        Parcel10 parcel = new Parcel10();

        Destination dest = parcel.destination("beijing",101.01f);
    }
}
