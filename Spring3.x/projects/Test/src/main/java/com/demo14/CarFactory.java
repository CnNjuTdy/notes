package com.demo14;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Tondiyee on 2017/2/7.
 */
public class CarFactory implements FactoryBean<Car> {
    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public Car getObject() throws Exception {
        Car car = new Car();
        String[] temp=carInfo.split(",");
        car.setBrand(temp[0]);
        car.setColor(temp[1]);
        car.setMaxSpeed(Integer.parseInt(temp[2]));
        return car;
    }

    public Class<Car> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
