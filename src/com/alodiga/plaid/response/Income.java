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
public class Income {

    private List<IncomeStream> income_streams;
    private String last_year_income;
    private String last_year_income_before_tax;
    private String max_number_of_overlapping_income_streams;
    private String number_of_income_streams;
    private String projected_yearly_income;
    private String projected_yearly_income_before_tax;

    public List<IncomeStream> getIncomeStreams() {
        return income_streams;
    }

    public void setIncomeStreams(List<IncomeStream> income_streams) {
        this.income_streams = income_streams;
    }

    public String getLast_year_income() {
        return last_year_income;
    }

    public void setLast_year_income(String last_year_income) {
        this.last_year_income = last_year_income;
    }

    public String getLast_year_income_before_tax() {
        return last_year_income_before_tax;
    }

    public void setLast_year_income_before_tax(String last_year_income_before_tax) {
        this.last_year_income_before_tax = last_year_income_before_tax;
    }

    public String getMax_number_of_overlapping_income_streams() {
        return max_number_of_overlapping_income_streams;
    }

    public void setMax_number_of_overlapping_income_streams(String max_number_of_overlapping_income_streams) {
        this.max_number_of_overlapping_income_streams = max_number_of_overlapping_income_streams;
    }

    public String getNumber_of_income_streams() {
        return number_of_income_streams;
    }

    public void setNumber_of_income_streams(String number_of_income_streams) {
        this.number_of_income_streams = number_of_income_streams;
    }

    public String getProjected_yearly_income() {
        return projected_yearly_income;
    }

    public void setProjected_yearly_income(String projected_yearly_income) {
        this.projected_yearly_income = projected_yearly_income;
    }

    public String getProjected_yearly_income_before_tax() {
        return projected_yearly_income_before_tax;
    }

    public void setProjected_yearly_income_before_tax(String projected_yearly_income_before_tax) {
        this.projected_yearly_income_before_tax = projected_yearly_income_before_tax;
    }

    @Override
    public String toString() {
        return "Income{" + "incomeStreams=" + income_streams + ", last_year_income=" + last_year_income + ", last_year_income_before_tax=" + last_year_income_before_tax + ", max_number_of_overlapping_income_streams=" + max_number_of_overlapping_income_streams + ", number_of_income_streams=" + number_of_income_streams + ", projected_yearly_income=" + projected_yearly_income + ", projected_yearly_income_before_tax=" + projected_yearly_income_before_tax + '}';
    }

}
