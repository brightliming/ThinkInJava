package com.liml.enumtest;

/**
 * Created by bright on 16-5-4.
 */
public class Meal {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(Course course:Course.values()){
                System.out.println(course.randomSelection());
            }
            System.out.println("------");
        }
    }
}
