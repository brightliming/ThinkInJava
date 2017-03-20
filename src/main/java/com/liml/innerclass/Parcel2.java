package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/25.
 */
public class Parcel2 {
    class Content{
        private int i = 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        public String readLabel(){return label;}
    }
    public Content content(){
        return new Content();
    }
    public Destination to(String s){
        return new Destination(s);
    }

    public void ship(){
        Content c = content();
        Destination d = to("beijing");
        System.out.println(d.readLabel());
    }

    public static void main(String[] args){
        Parcel2 parcel = new Parcel2();
        parcel.ship();
        Parcel2 q = new Parcel2();

        Content c = q.content();
        Destination d = q.to("beijing");
    }
}
