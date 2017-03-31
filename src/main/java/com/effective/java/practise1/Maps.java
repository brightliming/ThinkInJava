package com.effective.java.practise1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bright on 2017/3/31.
 */
public class Maps {
    public static <K,V> Map<K,V> newInstance(){
        return new HashMap<K,V>();
    }
}
