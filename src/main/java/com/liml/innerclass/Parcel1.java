package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/25.
 */
public class Parcel1 {
     class Content{
        private int i = 11;
        public int value(){return i;}
    }

    class Destination{
         private String label;

         Destination(String whereTo){
             label = whereTo;
         }
         String readLabel(){return label;}
    }

    public void ship(String destination){
        Content c = new Content();
        Destination d = new Destination(destination);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args){
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("beijing");
    }
}
