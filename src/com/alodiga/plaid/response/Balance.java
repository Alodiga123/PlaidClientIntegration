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
public class Balance {
    
     private String available;
    
    private String current;
    
    private String iso_currency_code;
    
    private String limit;
    
    private String unofficial_currency_code;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getIso_currency_code() {
        return iso_currency_code;
    }

    public void setIso_currency_code(String iso_currency_code) {
        this.iso_currency_code = iso_currency_code;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getUnofficial_currency_code() {
        return unofficial_currency_code;
    }

    public void setUnofficial_currency_code(String unofficial_currency_code) {
        this.unofficial_currency_code = unofficial_currency_code;
    }

    @Override
    public String toString() {
        return "Balance{" + "available=" + available + ", current=" + current + ", iso_currency_code=" + iso_currency_code + ", limit=" + limit + ", unofficial_currency_code=" + unofficial_currency_code + '}';
    }

    
    
    
}
