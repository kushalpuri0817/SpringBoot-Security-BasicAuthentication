package com.damithtech.springboot.basicauthentication.model;

/**
 * @author DAMITH SAMARAKOON on 3/26/2020
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
