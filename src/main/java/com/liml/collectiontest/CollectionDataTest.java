package com.liml.collectiontest;

import net.mindview.util.Generator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by bright on 16-5-13.
 */
class Goverment implements Generator<String>{
    String[] founds = ("A Strange women lying in the ponds distributing swords is " +
            "no basis for a system of goverment").split(" ");
    private int index;

    public String next(){return founds[index++];}
}
public class CollectionDataTest {
    public static void main(String[] args){
        Set<String> goverments = new LinkedHashSet(new CollectionData(new Goverment(),15));
        System.out.println(goverments);
        goverments.addAll(CollectionData.list(new Goverment(),15));
        System.out.println(goverments);
    }
}
