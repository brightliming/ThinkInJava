package com.liml.enumtest;

/**
 * Created by bright on 16-5-4.
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    Coffee(Food.Coffee.class);
    private Food[] values;
    private Course(Class<? extends Food> kind){
        values = kind.getEnumConstants();
    }
    public Food randomSelection(){
        return Enums.random(values);
    }


}
