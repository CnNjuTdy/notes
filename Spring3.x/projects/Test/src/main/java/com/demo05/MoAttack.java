package com.demo05;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by Tondiyee on 2017/1/24.
 */
public class MoAttack {
    @Autowired
    private GeLi geli;

    public void cityGateAsk(){
        geli.responseAsk("墨者革离！"+geli.getClass().toString());
    }

    public void setGeli(GeLi geli) {
        this.geli = geli;
    }

    public GeLi getGeli() {
        return geli;
    }
}
