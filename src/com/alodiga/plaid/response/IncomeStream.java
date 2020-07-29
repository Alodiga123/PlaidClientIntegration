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
public class IncomeStream {
    
    private String confidence;
    private String days;
    private String monthly_income;
    private String name;

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(String monthly_income) {
        this.monthly_income = monthly_income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IncomeStream{" + "confidence=" + confidence + ", days=" + days + ", monthly_income=" + monthly_income + ", name=" + name + '}';
    }
    
    
    
    
}
