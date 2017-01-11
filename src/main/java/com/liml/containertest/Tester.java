package com.liml.containertest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by bright on 16-5-24.
 */
public class Tester<C> {
    public static int fieldWidth = 8;
    public static TestParam[] defaultParam = TestParam.array(10,5000,100,5000,1000,5000,10000,500);
    protected C container;
    protected C initialize(int size){return container;}
    private String headline;
    private List<Test<C>> tests;

    private static String stringField(){
        return "%"+fieldWidth+"s";
    }
    private static String numberField(){
        return "%"+fieldWidth+"d";
    }
    private static int sizeWidth = 5;
    private static String sizeField = "%"+sizeWidth+"s";
    private TestParam[] paramList = defaultParam;
    public Tester(C container,List<Test<C>> tests){
        this.container = container;
        this.tests = tests;
        if(container != null){
            headline = container.getClass().getSimpleName();
        }
    }
    public Tester(C container,List<Test<C>> tests,TestParam[] paramList){
        this(container,tests);
        this.paramList = paramList;
    }
    public void setHeadline(String newHeadLine){
        this.headline = newHeadLine;
    }
    public static <C> void run(C cntner,List<Test<C>> tests){
        new Tester<C>(cntner,tests).timeTest();
    }

    public static <C> void run(C cntner,List<Test<C>> tests,TestParam[] paramList){
        new Tester<C>(cntner,tests,paramList).timeTest();
    }
    private void displayHeader(){
        int width = fieldWidth * tests.size() + sizeWidth;
        int dashLength = width - headline.length() - 1;
        StringBuilder head = new StringBuilder(width);
        for(int i = 0;i<width/2;i++){
            head.append("-");
        }
        head.append(" ");
        head.append(headline);
        head.append(" ");
        for(int i = 0;i<width/2;i++){
            head.append("-");
        }
        System.out.println(head);

        System.out.format(sizeField,"size");

        for(Test<C> test:tests){
            System.out.format(stringField(),test.name);
        }

        System.out.println();
    }

    public void timeTest(){
        displayHeader();
        for(TestParam param:paramList){
            System.out.format(sizeField,param.size);
            for(Test<C> test:tests){
                C kontainer = initialize(param.size);
                long start = System.nanoTime();
                int reps = test.test(kontainer,param);
                long duration = System.nanoTime() - start;

                long timeReps = duration / reps;

                System.out.format(numberField(),timeReps);

            }
            System.out.println();
        }
    }

}
