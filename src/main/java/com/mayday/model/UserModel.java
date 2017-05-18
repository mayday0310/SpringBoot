package com.mayday.model;

/**
 * Created by EricAi on 2017/5/11.
 */
public class UserModel {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
