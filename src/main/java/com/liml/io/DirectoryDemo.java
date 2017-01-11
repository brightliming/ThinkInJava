package com.liml.io;

import com.liml.util.PPrint;

import java.io.File;

/**
 * Created by Administrator on 2016/1/26.
 */
public class DirectoryDemo {
    public static void main(String[] args){
        PPrint.pprint(Directory.walk(".").dirs);

        for(File file:Directory.local(".","T.*"))
            System.out.println(file);
        System.out.println("---------------------------");

        for(File file:Directory.walk(".","T.*\\.java"))
            System.out.println(file);

        System.out.println("===========================");

        for(File file:Directory.walk(".",".*[Zz].*\\.class"))
            System.out.println(file);

    }
}
