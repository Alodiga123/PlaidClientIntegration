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
public class RetriveIncomeResponse {
    
    private Income income;
    private String request_id;

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    @Override
    public String toString() {
        return "RetriveIncomeResponse{" + "income=" + income + ", request_id=" + request_id + '}';
    }
    
    
    
    
    
    
    
    
}
