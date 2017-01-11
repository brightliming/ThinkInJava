package com.liml.annotationtest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bright on 16-5-11.
 */
public class UseCaseTracker {
    public static void trackUseCase(List<Integer> useCases,Class<?> cl){
        for(Method m: cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null){
                System.out.println("Find Use Case:"+uc.id()+"  "+uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }

        for(int i:useCases){
            System.out.println("Missing use case:"+i);
        }
    }
    public static void main(String[] args){
        List<Integer> useCaseList = new ArrayList<Integer>();
        Collections.addAll(useCaseList,47,48,49,50);
        trackUseCase(useCaseList,PassWordUtil.class);
    }
}
