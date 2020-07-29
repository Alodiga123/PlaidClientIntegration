/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alodiga.plaid.response;

import java.util.List;

/**
 *
 * @author ltoro
 */
public class RetriveIdentityResponse {

    private List<AccountsIdentity> accounts;    
    private Item item;
    private String request_id;

    public List<AccountsIdentity> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountsIdentity> accounts) {
        this.accounts = accounts;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    @Override
    public String toString() {
        return "RetriveIdentityResponse{" + "accounts=" + accounts + ", item=" + item + ", request_id=" + request_id + '}';
    }

    
    
    
   
    
   
    
    
}
