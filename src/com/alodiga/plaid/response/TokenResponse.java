/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alodiga.plaid.response;

/**
 *
 * @author ltoro
 */
public class TokenResponse {

    private String public_token;
    private String request_id;

    public String getPublic_token() {
        return public_token;
    }

    public void setPublic_token(String public_token) {
        this.public_token = public_token;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String toString() {
        return String.format("public_token:%s,request_id:%", public_token, request_id);
    }

}
