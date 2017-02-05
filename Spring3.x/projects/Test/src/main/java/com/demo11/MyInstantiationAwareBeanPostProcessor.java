package com.demo11;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * Created by Tondiyee on 2017/1/30.
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName)throws BeansException{
        if("car".equals(beanName)){
            System.out.println("postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            System.out.println("postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(
            PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        if("car".equals(beanName)){
            System.out.println("postProcessPropertyValues");
        }
        return pvs;
    }

}
