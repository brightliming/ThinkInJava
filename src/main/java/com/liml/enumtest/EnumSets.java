package com.liml.enumtest;

import java.util.EnumSet;
import static com.liml.enumtest.AlarmPoints.*;

/**
 * Created by bright on 16-5-4.
 */
public class EnumSets {
    public static void main(String[] args){
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);

        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1,OFFICE4));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}
