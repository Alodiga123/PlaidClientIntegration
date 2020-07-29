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
public class Transactions {
    
    private String account_id;
    private String account_owner;
    private String amount;
    private String[] category;
    private String category_id;
    private String date;
    private String iso_currency_code;
    private Location location;
    private String name;
    private PaymentMeta paymentMeta;
    private String pending;
    private String pending_transaction_id;
    private String transaction_id;
    private String transaction_type;
    private String unofficial_currency_code;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_owner() {
        return account_owner;
    }

    public void setAccount_owner(String account_owner) {
        this.account_owner = account_owner;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIso_currency_code() {
        return iso_currency_code;
    }

    public void setIso_currency_code(String iso_currency_code) {
        this.iso_currency_code = iso_currency_code;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentMeta getPaymentMeta() {
        return paymentMeta;
    }

    public void setPaymentMeta(PaymentMeta paymentMeta) {
        this.paymentMeta = paymentMeta;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public String getPending_transaction_id() {
        return pending_transaction_id;
    }

    public void setPending_transaction_id(String pending_transaction_id) {
        this.pending_transaction_id = pending_transaction_id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getUnofficial_currency_code() {
        return unofficial_currency_code;
    }

    public void setUnofficial_currency_code(String unofficial_currency_code) {
        this.unofficial_currency_code = unofficial_currency_code;
    }

    @Override
    public String toString() {
        return "Transactions{" + "account_id=" + account_id + ", account_owner=" + account_owner + ", amount=" + amount + ", category=" + category + ", category_id=" + category_id + ", date=" + date + ", iso_currency_code=" + iso_currency_code + ", location=" + location + ", name=" + name + ", paymentMeta=" + paymentMeta + ", pending=" + pending + ", pending_transaction_id=" + pending_transaction_id + ", transaction_id=" + transaction_id + ", transaction_type=" + transaction_type + ", unofficial_currency_code=" + unofficial_currency_code + '}';
    }
    
    
}
