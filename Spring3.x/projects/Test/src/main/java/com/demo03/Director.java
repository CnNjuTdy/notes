package com.demo03;

/**
 * Created by Tondiyee on 2017/1/24.
 */
public class Director {
    public void directMovies(){
        MoAttack moAttack = new MoAttack(new LiuDeHua());//导演来创建一个演员饰演革离角色
        moAttack.cityGateAsk();
    }
}
