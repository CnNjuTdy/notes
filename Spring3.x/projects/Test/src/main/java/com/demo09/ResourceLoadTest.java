package com.demo09;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;


/**
 * Created by Tondiyee on 2017/1/27.
 */
public class ResourceLoadTest {
    public static void main(String[] args) throws Throwable {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath:*.txt");
        System.out.println(resources.length);
        for (Resource resource:resources){
            System.out.println(resource.getDescription());
        }
    }
}
