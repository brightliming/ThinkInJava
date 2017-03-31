package com.effective.java.practise2;

/**
 * Created by Bright on 2017/3/31.
 */
public class NutritionFacts {
    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class NutritionFactBuilder implements  Builder<NutritionFacts>{
        private final int servingSize;
        private final int serving;
        private  int calories = 0;
        private  int fat = 0;
        private  int sodium = 0;
        private  int carbohydrate = 0;

        public NutritionFactBuilder(int servingSize,int serving){
            this.servingSize = servingSize;
            this.serving = serving;
        }

        public NutritionFactBuilder calories(int val){
            calories = val;
            return this;
        }

        public NutritionFactBuilder fat(int val){
            fat = val;
            return this;
        }

        public NutritionFactBuilder sodium(int val){
            sodium = val;
            return this;
        }

        public NutritionFactBuilder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }



        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){

    }
}
