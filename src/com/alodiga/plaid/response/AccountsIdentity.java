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
public class AccountsIdentity {

    private String account_id;
    private Balance balances;
    private String mask;
    private String name;
    private String official_name;
    private List<Owners> owners;
    private String subtype;
    private String type;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public Balance getBalances() {
        return balances;
    }

    public void setBalances(Balance balances) {
        this.balances = balances;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficial_name() {
        return official_name;
    }

    public void setOfficial_name(String official_name) {
        this.official_name = official_name;
    }

    public List<Owners> getOwners() {
        return owners;
    }

    public void setOwners(List<Owners> owners) {
        this.owners = owners;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccountsIdentity{" + "account_id=" + account_id + ", balances=" + balances + ", mask=" + mask + ", name=" + name + ", official_name=" + official_name + ", owners=" + owners + ", subtype=" + subtype + ", type=" + type + '}';
    }

    
    
    
    
}
