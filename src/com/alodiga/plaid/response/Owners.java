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
public class Owners {
    
    
    private List<Addresses> addresses;
    private List<Emails> emails;
    private String[] names;
    private List<PhoneNumber> phone_numbers;

    public List<Addresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Addresses> addresses) {
        this.addresses = addresses;
    }

    public List<Emails> getEmails() {
        return emails;
    }

    public void setEmails(List<Emails> emails) {
        this.emails = emails;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<PhoneNumber> getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(List<PhoneNumber> phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    @Override
    public String toString() {
        return "Owners{" + "addresses=" + addresses + ", emails=" + emails + ", names=" + names + ", phone_numbers=" + phone_numbers + '}';
    }

    
    
    
    
    
}
