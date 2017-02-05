package com.demo11;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Tondiyee on 2017/1/30.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("car")){
            System.out.println("postProcessBeforeInitialization");
            Car car = (Car)bean;
            if(car.getColor()==null){
                car.setColor("black");
                System.out.println("postProcessBeforeInitialization:default black");
            }
            if(car.getBrand()==null){
                car.setBrand("HongQi");
                System.out.println("postProcessBeforeInitialization:default HongQi");
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("car")){
            System.out.println("postProcessAfterInitialization");
            Car car = (Car)bean;
            if(car.getMaxSpeed()>200||car.getMaxSpeed()<100){
                car.setMaxSpeed(200);
                System.out.println("postProcessAfterInitialization:default 200");
            }
        }
        return bean;
    }
}
