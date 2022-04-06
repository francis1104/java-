package com.itheima.hf.homework;

public class StringTest01 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 50000; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        String[] split = s.split("1");
        System.out.println(split.toString());
    }
}
