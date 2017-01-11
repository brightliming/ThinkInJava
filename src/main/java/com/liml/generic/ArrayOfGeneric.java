package com.liml.generic;

/**
 * Created by Administrator on 2016/1/19.
 */
class Generic<T>{}
public class ArrayOfGeneric {
        static final int SIZE = 100;
        static Generic<Integer>[] gia;
        @SuppressWarnings("unchecked")
        public static void main(String[] args){
           // gia = (Generic<Integer>[]) new Object[SIZE];
            gia = (Generic<Integer>[]) new Generic[SIZE];
            System.out.println(gia.getClass().getSimpleName());
            gia[0] = new Generic<Integer>();
            System.out.println(gia[0].getClass().getSimpleName());
            //gia[1] = new Object();
            //gia[2] = new Generic<Double>();

        }

}
