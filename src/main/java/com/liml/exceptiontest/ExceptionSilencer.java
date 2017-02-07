package com.liml.exceptiontest;

/**
 * Created by Administrator on 2017/2/7.
 */
public class ExceptionSilencer {
    public static void main(String[] args){
        try{
            throw new RuntimeException();
        }finally {
            return;
        }
    }
}
