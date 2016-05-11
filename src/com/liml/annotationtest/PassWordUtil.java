package com.liml.annotationtest;

import java.util.List;

/**
 * Created by bright on 16-5-11.
 */
public class PassWordUtil {
    @UseCase(id=47,description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }
    @UseCase(id=48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id=49,description = "New password can't equal previously Used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password){
        return prevPasswords.contains(password);
    }
}
