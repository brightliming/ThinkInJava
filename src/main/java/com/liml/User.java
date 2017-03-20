package com.liml;

/**
 * Created by Administrator on 2016/3/22.
 */
public class User {

    private String name;
    private int age;
    private String school;
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
    public User(String name,int age,String school){
        this(name,age);
        this.school = school;
    }
    public User(String name,String school){
        this.name = name;
        this.school = school;
    }
    public static void main(String[] args){
        User user = new User("liming",30);
    }
}
