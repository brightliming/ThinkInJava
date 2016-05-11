package com.liml.enumtest;

import java.util.Random;

import static com.liml.enumtest.Outcome.*;

/**
 * Created by bright on 16-5-10.
 */
interface Item {
    Outcome compete(Item item);
    Outcome eval(Paper paper);
    Outcome eval(Scissors scissors);
    Outcome eval(Rock rock);
}
class Paper implements Item{
    @Override
    public Outcome compete(Item item) {
        return this.eval(this);
    }

    @Override
    public Outcome eval(Paper paper) {
        return DRAW;
    }

    @Override
    public Outcome eval(Scissors scissors) {
        return LOSE;
    }

    @Override
    public Outcome eval(Rock rock) {
        return WIN;
    }

    @Override
    public String toString(){return "Paper";}
}

class Scissors implements Item{

    @Override
    public Outcome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public Outcome eval(Paper paper) {
        return WIN;
    }

    @Override
    public Outcome eval(Scissors scissors) {
        return DRAW;
    }

    @Override
    public Outcome eval(Rock rock) {
        return LOSE;
    }

    @Override
    public String toString(){return "Scissors";}
}
class Rock implements Item{
    @Override
    public Outcome compete(Item item) {
        return item.eval(this);
    }

    @Override
    public Outcome eval(Paper paper) {
        return LOSE;
    }

    @Override
    public Outcome eval(Scissors scissors) {
        return WIN;
    }

    @Override
    public Outcome eval(Rock rock) {
        return DRAW;
    }

    @Override
    public String toString(){return "Rock";}
}
public class RoShamBo1{
    static final int SIZE=20;
    private static Random random = new Random(47);
    public static Item newItem(){
        switch(random.nextInt(3)){
            default:
            case 0:return new Paper();
            case 1:return new Scissors();
            case 2:return new Rock();
        }
    }
    public static void match(Item a,Item b){
        System.out.println(b+" VS."+a+" :"+a.compete(b));
    }

    public static void main(String[] args){
        for(int i=0;i<SIZE;i++){
            match(newItem(),newItem());
        }
    }
}
