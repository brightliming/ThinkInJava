package com.liml;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bright on 2017/3/22.
 */
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    private volatile int hashCode;

    public PhoneNumber(int areaCode,int prefix,int lineNumber){
        rangeCheck(areaCode,999,"area code");
        rangeCheck(prefix,999,"prefix");
        rangeCheck(lineNumber,999,"line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg,int max,String name){
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name+" : "+arg);
        }
    }

    @Override
   public boolean equals(Object o){
        if( o == this){
            return true;
        }
        if(! (o instanceof PhoneNumber)){
            return false;
        }

        PhoneNumber phoneNumber = (PhoneNumber) o;

        return phoneNumber.areaCode == areaCode && phoneNumber.prefix == prefix && phoneNumber.lineNumber == lineNumber;
   }

    @Override
   public int hashCode(){
        int result = hashCode;
        if(result == 0){
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
   }
   public static void main(String[] args){
       Map<PhoneNumber,String> map = new HashMap<PhoneNumber, String>();

       map.put(new PhoneNumber(10,20,30),"john");

       System.out.println(map.get(new PhoneNumber(10,20,30)));
   }

}
