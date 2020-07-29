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
public class Addresses {
    
    private Data data;
    private String primary;



    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    @Override
    public String toString() {
        return "Addresses{" + "data=" + data + ", primary=" + primary + '}';
    }

   
    
    
}
