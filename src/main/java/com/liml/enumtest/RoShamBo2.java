package com.liml.enumtest;

import static com.liml.enumtest.Outcome.*;
/**
 * Created by bright on 16-5-10.
 */
public enum RoShamBo2 {
    PAPAER(DRAW,LOSE,WIN),
    SCISSORS(WIN,DRAW,LOSE),
    ROCK(LOSE,WIN,DRAW);
    private Outcome vPAPER,vSCISSORS,vROCK;
    RoShamBo2(Outcome paper,Outcome scissors,Outcome rock){
        this.vPAPER = paper;
        this.vSCISSORS = scissors;
        this.vROCK = rock;
    }
    public Outcome compete(RoShamBo2 it){
        switch(it){
            default:
            case PAPAER:return vPAPER;
            case SCISSORS:return vSCISSORS;
            case ROCK:return vROCK;
        }
    }


}
