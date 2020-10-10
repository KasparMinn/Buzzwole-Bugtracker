package com.kaspar.bzzwole.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    private String userName;
    private String passWord;
    private String email;
    private String userLevel;
    private String userAuth;

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPassWord() { return passWord; }
    public void setPassWord(String passWord) { this.passWord = passWord; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getUserLevel() { return userLevel; }
    public void setUserLevel(String userLevel) { this.userLevel = userLevel; }

    public String getUserAuth() { return userAuth; }
    public void setUserAuth(String userAuth) { this.userAuth = userAuth; }

    public User(String userName, String passWord, String email, String userLevel, String userAuth) {

        super();
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.userLevel = userLevel;
        this.userAuth = userAuth;
    }
}
