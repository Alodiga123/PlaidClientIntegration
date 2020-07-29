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
public class Numbers {
    
    private List<Ach> ach;
    private String[] eft;

    public List<Ach> getAch() {
        return ach;
    }

    public void setAch(List<Ach> ach) {
        this.ach = ach;
    }

    

    public String[] getEft() {
        return eft;
    }

    public void setEft(String[] eft) {
        this.eft = eft;
    }

    @Override
    public String toString() {
        return "Numbers{" + "ach=" + ach + ", eft=" + eft + '}';
    }
    
    

    
}
