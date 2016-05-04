package com.liml.enumtest;

/**
 * Created by bright on 16-5-4.
 */
public interface Food {
    enum Appetizer implements Food{
        SALAD,SOUP,SPRING_ROLLS
    }
    enum MainCourse implements Food{
        LASAGNE,BURRITO,PAD_THAI,LENILS,HUMMOUS,VINDALOO
    }
    enum Dessert implements Food{
        TIRAMISU,GELATO,BLACK_FOREST_CAKE,FRUIT,CREME_CARAMEL
    }
    enum Coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,
        LATTE,CAPPOCCINO,TEA,HERB_TEA
    }
}

