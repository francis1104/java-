package com.itheima.hf.homework;

public class HeightTest {
    public static void main(String[] args) {
        int height1 = 210;
        int height2 = 165;
        int height3 = 150;
        int tempHeight = height1 > height2 ? height1 : height2;
        int max = tempHeight > height3 ? tempHeight : height3;
        System.out.println(max);
    }
}
