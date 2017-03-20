package com.liml;


/**
 * Created by bright on 2017/3/20.
 */
public class Test {


    private static Long n = 0l;
    public static void main(String[] args){

        long start = System.currentTimeMillis();
        for(long i =0;i< Integer.MAX_VALUE;i++){
            n += i;
        }
        System.out.println(n);
        System.out.println(System.currentTimeMillis()-start);
    }
}
