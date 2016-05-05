package com.liml.enumtest;
import java.util.EnumMap;
import java.util.Map;

import static com.liml.enumtest.AlarmPoints.*;

/**
 * Created by bright on 16-5-4.
 */
interface Commond{
    void action();
}
public class EnumMaps {
    public static void main(String[] args){
        EnumMap<AlarmPoints,Commond> em = new EnumMap<AlarmPoints,Commond>(AlarmPoints.class);
        em.put(KITCHEN, new Commond() {
            @Override
            public void action() {
                System.out.println("Kitchen fire");
            }
        });

        em.put(BATHROOM, new Commond() {
            @Override
            public void action() {
                System.out.println("Bathroom alarm");
            }
        });

        for(Map.Entry<AlarmPoints,Commond> e:em.entrySet()){
            System.out.print(e.getKey()+" : ");
            e.getValue().action();
        }

        try{
            em.get(UTILITY).action();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
