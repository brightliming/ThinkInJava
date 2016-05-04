package com.liml.enumtest;

/**
 * Created by bright on 16-5-4.
 */

enum Search{HITHER,YON}
public class UpcaseEnum {

    public static void main(String[] args){
        Search[] vals = Search.values();

        Enum e = Search.HITHER;
        for(Enum en:e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }

}
