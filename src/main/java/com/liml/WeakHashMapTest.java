package com.liml;

import java.util.WeakHashMap;

/**
 * Created by bright on 2017/3/20.
 */
public class WeakHashMapTest {
    public static void main(String[] args){
        WeakHashMap weakMap = new WeakHashMap();

        weakMap.put(new String("数学"),"98");
        weakMap.put(new String("英语"),"100");
        weakMap.put("java","is good");
        System.out.println(weakMap);
        System.gc();
        System.runFinalization();
        System.out.println(weakMap);
    }
}
