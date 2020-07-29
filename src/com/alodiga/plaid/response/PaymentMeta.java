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
public class PaymentMeta {
    
    private String by_order_of;
    private String payee;
    private String payer;
    private String payment_method;
    private String payment_processor;
    private String ppd_id;
    private String reason;
    private String reference_number;

    public String getBy_order_of() {
        return by_order_of;
    }

    public void setBy_order_of(String by_order_of) {
        this.by_order_of = by_order_of;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_processor() {
        return payment_processor;
    }

    public void setPayment_processor(String payment_processor) {
        this.payment_processor = payment_processor;
    }

    public String getPpd_id() {
        return ppd_id;
    }

    public void setPpd_id(String ppd_id) {
        this.ppd_id = ppd_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReference_number() {
        return reference_number;
    }

    public void setReference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    @Override
    public String toString() {
        return "PaymentMeta{" + "by_order_of=" + by_order_of + ", payee=" + payee + ", payer=" + payer + ", payment_method=" + payment_method + ", payment_processor=" + payment_processor + ", ppd_id=" + ppd_id + ", reason=" + reason + ", reference_number=" + reference_number + '}';
    }
    
    
    
    
}
