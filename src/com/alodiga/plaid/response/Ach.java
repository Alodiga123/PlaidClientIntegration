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
public class Ach {
    
    private String account;
    private String account_id;
    private String routing;
    private String wire_routing;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getRouting() {
        return routing;
    }

    public void setRouting(String routing) {
        this.routing = routing;
    }

    public String getWire_routing() {
        return wire_routing;
    }

    public void setWire_routing(String wire_routing) {
        this.wire_routing = wire_routing;
    }

    @Override
    public String toString() {
        return "Ach{" + "account=" + account + ", account_id=" + account_id + ", routing=" + routing + ", wire_routing=" + wire_routing + '}';
    }

    
}
