package com.demo05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Tondiyee on 2017/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMoAttack {
    @Autowired
    MoAttack moAttack;

    @Test
    public void TestCityGateAsk(){
        moAttack.cityGateAsk();
    }
}
