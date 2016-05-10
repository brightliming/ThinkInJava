package com.liml.enumtest;

import java.util.Random;

/**
 * Created by bright on 16-5-4.
 */
public class Enums {
    private static Random randInt = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }
    public static <T> T random(T[] values){
        return values[randInt.nextInt(values.length)];
    }
}
