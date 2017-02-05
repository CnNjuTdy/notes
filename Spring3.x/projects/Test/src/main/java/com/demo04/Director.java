package com.demo04;

/**
 * Created by Tondiyee on 2017/1/24.
 */
public class Director {
    public void directMovies(){
        MoAttack moAttack = new MoAttack();//导演来创建一个演员饰演革离角色
        moAttack.setGeLi(new LiuDeHua());
        moAttack.cityGateAsk();
    }
}
