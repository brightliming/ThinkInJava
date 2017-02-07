package com.liml.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/1/1.
 */
public class CollectionPrintTest {
    public static void main(String[] args){
        List<String> nameList = Arrays.<String>asList("tom", "jerry", "wuddy");
        //nameList.add("Naruto");
        ArrayList<String> nameList2 = new ArrayList<String>(nameList);
        nameList2.add("Naruto");
        System.out.println(nameList);
        System.out.println(nameList2);
    }
}
