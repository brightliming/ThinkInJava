package com.liml.enumtest;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by bright on 16-5-4.
 */
public enum ConstantSpecificMethod {
    DATE_TIME{
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
      String getInfo(){
          return System.getProperty("java.version");
      }
    };

    abstract String getInfo();

    public static void main(String[] args){

        for(ConstantSpecificMethod cm:ConstantSpecificMethod.values()){
            System.out.println(cm.getInfo());
        }
    }
}
