package com.demo06;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Tondiyee on 2017/1/24.
 */
public class TestCar {
    @Test
    public void TestCar1(){
        Car car = new Car("红旗","红色",200);
        System.out.println(car);
    }

    @Test
    public void TestCar2()throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.demo06.Car");

        Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)constructor.newInstance();

        Method setBrand = clazz.getDeclaredMethod("setBrand",String.class);
        setBrand.invoke(car,"红旗");

        Method setColor = clazz.getDeclaredMethod("setColor",String.class);
        setColor.invoke(car,"黑色");

        Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,300);

        System.out.println(car);

        Field siji = clazz.getDeclaredField("siji");
        siji.setAccessible(true);
        siji.set(car,"laosiji");

        Method drive = clazz.getDeclaredMethod("drive",(Class[])null);
        drive.setAccessible(true);
        System.out.println(drive.invoke(car));

    }
}
