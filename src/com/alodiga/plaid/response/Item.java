/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alodiga.plaid.response;

/**
 *
 * @author usuario
 */
public class Item {

    private String[] available_products;
    private String[] billed_products;
    private String error;
    private String institution_id;
    private String item_id;
    private String webhook;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    public String[] getAvailable_products() {
        return available_products;
    }

    public void setAvailable_products(String[] available_products) {
        this.available_products = available_products;
    }

    public String[] getBilled_products() {
        return billed_products;
    }

    public void setBilled_products(String[] billed_products) {
        this.billed_products = billed_products;
    }

    @Override
    public String toString() {
        return "Item{" + "error=" + error + ", institution_id=" + institution_id + ", available_products=" + available_products + ", billed_products=" + billed_products + ", item_id=" + item_id + ", webhook=" + webhook + '}';
    }

}
