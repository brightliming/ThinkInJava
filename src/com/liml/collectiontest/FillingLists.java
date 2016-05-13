package com.liml.collectiontest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bright on 16-5-13.
 */
class StringAdress{
    private String s;
    public StringAdress(String s){this.s = s;}
    public String toString(){
        return super.toString()+" "+s;
    }
}
public class FillingLists {
    public static void main(String[] args){
        ArrayList<StringAdress> list = new ArrayList<StringAdress>(
                Collections.nCopies(4,new StringAdress("Hello")));
        System.out.println(list);

        Collections.fill(list,new StringAdress("World"));

        System.out.println(list);

    }

}
