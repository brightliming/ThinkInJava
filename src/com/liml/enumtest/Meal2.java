package com.liml.enumtest;

/**
 * Created by bright on 16-5-4.
 */
public enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    Coffee(Food.Coffee.class);
    private Food[] values;
    private Meal2(Class<? extends Food> kind){
        values = kind.getEnumConstants();
    }
    interface Food {
        enum Appetizer implements Food{
            SALAD,SOUP,SPRING_ROLLS;
        }
        enum MainCourse implements Food{
            LASAGNE,BURRITO,PAD_THAI,LENILS,HUMMOUS,VINDALOO;
        }
        enum Dessert implements Food{
            TIRAMISU,GELATO,BLACK_FOREST_CAKE,FRUIT,CREME_CARAMEL;
        }
        enum Coffee implements Food{
            BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,
            LATTE,CAPPOCCINO,TEA,HERB_TEA;
        }
    }
    public Food randomSelection(){
        return Enums.random(values);
    }
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(Meal2 meal:Meal2.values()){
                System.out.println(meal.randomSelection());
            }
            System.out.println("------");
        }
    }
}
