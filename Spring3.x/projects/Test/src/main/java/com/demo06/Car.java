package com.demo06;

/**
 * Created by Tondiyee on 2017/1/24.
 */
public class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    private String siji;

    public Car() {
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return "brand:"+brand+"\ncolor:"+color+"\nmax speed:"+maxSpeed;
    }
    private String drive(){
        return siji;
    }
}
