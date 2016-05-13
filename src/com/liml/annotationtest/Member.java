package com.liml.annotationtest;

/**
 * Created by bright on 16-5-11.
 */
@DBTable(name="Member")
public class Member {
    @SQLString(30) private String firstName;
    @SQLString(20) private String lastName;
    @SQLInteger private Integer age;
    @SQLString(value=30,constraints = @Constraints(primaryKey=true)) private String handle;



    public String getHandle() {
        return handle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }




}
