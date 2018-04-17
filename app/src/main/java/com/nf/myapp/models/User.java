package com.nf.myapp.models;

/**
 * Created by KarAmad-user on 4/17/2018.
 */

public class User
{
    private String userName;
    private String passWord;
    private int id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
