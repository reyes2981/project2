package com.spring.springtech.model.response;

public class LoginResponse {

    private String JWT;

    public String getJWT() {
        return JWT;
    }

    public LoginResponse(String JWT) {
        this.JWT = JWT;
    }

    public void setJWT(String JWT) {
        this.JWT = JWT;
    }
}
