package com.liml.enumtest;

import java.util.EnumSet;

/**
 * Created by bright on 16-5-5.
 */
public class CarWash {
    public enum Cycle{
        UNDERBODY {
            void action(){System.out.println("Sparying the underbody");}
        },
        WHEELWASH {
            void action(){System.out.println("Washing the wheels");}
        },
        PREWASH {
            void action(){System.out.println("Loosening the dirt");}
        },
        BASIC {
            void action(){System.out.println("The basic wash");}
        },
        HATWAX {
            void action(){System.out.println("Applying hot wax");}
        },
        RINSE {
            void action(){System.out.println("Rinsing");}
        },
        BLOWDRY{
            void action(){System.out.println("Blowing dry");}
        };
        abstract void action();
    }

    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC,Cycle.RINSE);

    public void add(Cycle cycle){cycles.add(cycle);}

    public void washCar(){
        for(Cycle cycle:cycles){
            cycle.action();
        }
    }

    public String toString(){
        return cycles.toString();
    }

    public static void main(String[] args){
        CarWash wash = new CarWash();
        wash.washCar();
        System.out.println(wash);
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HATWAX);
        wash.washCar();
        System.out.println(wash);

    }
}
