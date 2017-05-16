package com.demo16;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static boolean resolve(int[] A) {
        int halfIndex = half(A);
        if (halfIndex == -1) {
            return false;
        }
        //前半段
        int[] A1 = new int[halfIndex + 1];
        for (int i = 1; i < A1.length; i++) {
            A1[i] = A[i];
        }
        int halfIndex1 = half(A1);
        if (halfIndex1 == -1) {
            return false;
        }

        //后半段
        int[] A2 = new int[A.length - halfIndex];
        for (int i = 0; i < A2.length; i++) {
            A2[i] = A[i + halfIndex + 1];
        }
        int halfIndex2 = half(A2);
        if (halfIndex2 == -1) {
            return false;
        }
        return true;
    }


    //二等分,返回下标
    static int half(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int sum2 = 0;
        for (int i = 0; i < A.length-1; i++) {
            sum2 += A[i];
            if (sum-sum2-A[i+1]==sum2) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> inputs = new ArrayList<Integer>();
//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//        while (line != null) {
//            int value = Integer.parseInt(line.trim());
//            if (value == 0) break;
//            inputs.add(value);
//            line = in.nextLine();
//        }
//        int[] A = new int[inputs.size()];
//        for (int i = 0; i < inputs.size(); i++) {
//            A[i] = inputs.get(i).intValue();
//        }
//        Boolean res = resolve(A);
//
//        System.out.println(String.valueOf(res));

        int[] A = {2, 5, 1, 1, 1, 1, 4};
        System.out.println(half(A));
    }
}