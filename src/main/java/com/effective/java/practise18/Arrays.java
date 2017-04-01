package com.effective.java.practise18;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by Bright on 2017/4/1.
 */
public class Arrays {
    public static <T> List<T> intArrayAsList(final T[] a){
            if(a == null){
                throw new NullPointerException();
            }

            return new AbstractList<T>() {
                @Override
                public T get(int i) {
                    return a[i];
                }
                @Override
                public T set(int i,T val){
                    T oldValue = a[i];
                    a[i] = val;
                    return oldValue;
                }

                @Override
                public int size() {
                    return a.length;
                }
            };
    }


    public static void main(String[] args){
        List<String> names = intArrayAsList(new String[]{"tom","jerry","wudi"});
        System.out.println(names);
        names.set(1,"bright");
        System.out.println(names);
    }
}
