package com.liml.enumtest;
import static com.liml.enumtest.Spiciness.*;

/**
 * Created by bright on 16-4-26.
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree = degree;
    }
    @Override
    public String toString(){
        return "Burrito is "+degree;
    }
    public static void main(String[] args){
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MILD));
        System.out.println(new Burrito(HOT));
        System.out.println(new Burrito(MEDIUM));
    }

}
