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
public class RetriveTransactionResponse {

    private List<Accounts> accounts;
    private Item item;
    private String request_id;
    private String total_transactions;
    private List<Transactions> transactions;

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
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

    public String getTotal_transactions() {
        return total_transactions;
    }

    public void setTotal_transactions(String total_transactions) {
        this.total_transactions = total_transactions;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "RetriveTransactionResponse{" + "accounts=" + accounts + ", item=" + item + ", request_id=" + request_id + ", total_transactions=" + total_transactions + ", transactions=" + transactions + '}';
    }
    

    
}
