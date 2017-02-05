package com.demo11;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by Tondiyee on 2017/1/30.
 */
public class BeanLifeCycle {
    @Test
    public void LifeCycle(){
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");


        Car car1 = (Car)context.getBean("car");
        System.out.println(car1);

        Car car2 = (Car)context.getBean("car");
        System.out.println(car2==car1);

    }
}
