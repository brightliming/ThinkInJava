package com.liml.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created by bright on 16-5-24.
 */
public class FastFail {
    public static void main(String[] args){
        Collection<String> list = new ArrayList<String>();
        Iterator it = list.iterator();
        list.add("aaa");
        try{
            it.next();
        }catch(ConcurrentModificationException e){
            e.printStackTrace();
        }

    }
}
