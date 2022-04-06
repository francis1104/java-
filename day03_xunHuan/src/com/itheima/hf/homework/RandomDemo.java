package com.itheima.hf.homework;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 1;
        while (i <= 100) {
            int num = r.nextInt(91) + 36;//36-126
            System.out.println(num);
            i++;

        }
    }
}
