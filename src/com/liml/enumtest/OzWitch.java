package com.liml.enumtest;

/**
 * Created by bright on 16-4-26.
 */
public enum OzWitch {
    WEST("WEST"),EAST("EAST"),NORTH("NORTH"),SOUTH("SOUTH");
    private String description;
    private OzWitch(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public static void main(String[] args){
        for(OzWitch value:OzWitch.values()){
            System.out.println(value.getDescription());
        }
    }
}
