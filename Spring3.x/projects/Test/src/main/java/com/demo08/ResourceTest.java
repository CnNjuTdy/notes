package com.demo08;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Tondiyee on 2017/1/27.
 */
public class ResourceTest {
//    public void testRe(){
//        System.out.println(this.getClass().getResource("").getPath());
//    }
    public static void main(String[] args) {
//        new ResourceTest().testRe();
        Resource resource1 = new FileSystemResource("E:/Git/notes/Spring3.x/projects" +
                "/Test/src/resource/applicationContext.xml");
        Resource resource2 = new ClassPathResource("applicationContext.xml");

        try {
            InputStream is = resource2.getInputStream();
            System.out.println(convertStreamToString(is));
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertStreamToString(InputStream is) {
        /*
          * To convert the InputStream to String we use the BufferedReader.readLine()
          * method. We iterate until the BufferedReader return null which means
          * there's no more data to read. Each line will appended to a StringBuilder
          * and returned as String.
          */
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

}
