package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args){
        Parcel8 parcel8 = new Parcel8();
        Wrapping w = parcel8.wrapping(10);
        System.out.println(w.value());
    }
}
