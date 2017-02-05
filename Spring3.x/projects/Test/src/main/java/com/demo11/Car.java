package com.demo11;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by Tondiyee on 2017/1/30.
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean ,DisposableBean{
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car(){
        System.out.println("Constructor without params");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        System.out.println("Setter of brand");
        this.brand = brand;
    }

    public void setColor(String color) {
        System.out.println("Setter of color");
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        System.out.println("Setter of maxSpeed");
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString(){
        return "brand:"+brand+"\ncolor:"+color+"\nmax speed:"+maxSpeed;
    }

    public void setBeanName(String name) {
        System.out.println("setBeanName:"+name);
        this.beanName = name;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:"+beanFactory);
        this.beanFactory = beanFactory;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void myInit(){
        System.out.println("init-method");
    }

    public void myDestroy(){
        System.out.println("destroy-method");
    }
}
