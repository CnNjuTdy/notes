package com.demo10;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by Tondiyee on 2017/1/29.
 */
public class CarTest {
    @Test
    public void TestCar() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:bean1.xml");
        BeanFactory xmlBeanFactory = new XmlBeanFactory(res);

        Car car = xmlBeanFactory.getBean("car1", Car.class);
        System.out.println(car);
    }

    @Test
    public void TestCar2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Car car = context.getBean("car1",Car.class);
        System.out.println(car);
    }

}
