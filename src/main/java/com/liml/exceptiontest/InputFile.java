package com.liml.exceptiontest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/2/7.
 */
public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            throw e;
        }catch(Exception e){
            try{
                in.close();
            }catch(IOException ex){
                System.out.println("in.close unsuccessful");
            }
        }
    }

    public String getLine(){
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose(){
        try {
            in.close();
            System.out.println("dispose successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
