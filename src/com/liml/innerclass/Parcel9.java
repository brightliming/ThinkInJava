package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args){
        Parcel9 parcel = new Parcel9();
        Destination dest = parcel.destination("beijing");
        System.out.println(dest.readLabel());
    }
}
