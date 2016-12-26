package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }
    public static void main(String[] args){
        Parcel7 parcel = new Parcel7();
        Contents c = parcel.contents();
        System.out.println(c.value());
    }
}
