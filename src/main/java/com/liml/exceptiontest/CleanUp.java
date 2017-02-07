package com.liml.exceptiontest;

/**
 * Created by Administrator on 2017/2/7.
 */
public class CleanUp {
    public static void main(String[] args){
        try {
            InputFile file = new InputFile("d:/sample.txt");
            try{
                String s;
                int i = 1;
                while((s = file.getLine()) != null){
                    System.out.println(s);
                }
            }catch(Exception e){
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            }finally {
                file.dispose();
            }
        } catch (Exception e) {
            System.out.println("File Construction failed");
        }
    }
}
