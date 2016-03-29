package com.liml.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/3/15.
 */
class Data implements Serializable{
    private int n;

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }

    private List<String> dataList = new ArrayList<String>();
    public Data(int n){this.n = n;}
    public String toString(){
        return Integer.toString(n)+"----"+dataList.toString();
    }
}
public class Worm implements Serializable{
    private static Random rand = new Random(47);
    private Data[] d = {
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10))
    };
    private Worm next;
    private char c;

    public Worm(int i,char x){
        System.out.println("Worm contractor: "+i);
        c = x;
        if(--i>0)
            next = new Worm(i,(char)(x+1));
    }
    public Worm(){
        System.out.println("Default constructor");
    }
    public String toString(){
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for(Data dat : d){
            result.append(dat);
        }
        result.append(")");
        if(next != null)
            result.append(next);
        return result.toString();
    }
    public static void main(String[] args) throws ClassNotFoundException,IOException{
//        Worm w = new Worm(6,'a');
//        System.out.println("w = " + w);
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm.out"));
//
//        out.writeObject("Worm storage\n");
//        out.writeObject(w);
//        out.close();
//
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("worm.out"));
//
//        String s = (String)in.readObject();
//
//        Worm w2 = (Worm)in.readObject();
//        System.out.println(s + "w2 = "+ w2);
        List<String> dataList = new ArrayList<String>();
        dataList.add("bright");
        dataList.add("liming");
        Data data = new Data(20);
        data.setDataList(dataList);
        System.out.println("data = " + data);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.out"));

        out.writeObject("Data storage\n");
        out.writeObject(data);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.out"));

        String s = (String)in.readObject();

        Data data2 = (Data)in.readObject();
        System.out.println(s + "data2 = "+ data2);

    }

}
