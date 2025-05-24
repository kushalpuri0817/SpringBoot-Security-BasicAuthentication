package com.damithtech.springboot.basicauthentication.model;

/**
 * @author Kushal Puri on 6/8/2024
 */

public class User {
    private String userName;
    private String id;

    public User(String userName, String id) {
        this.userName = userName;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
