package com.DEMOJWT.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
    private String userName;
    private String pwd;
    private String token;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
