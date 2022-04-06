package com.ithema.hf.homework;

import java.util.Scanner;

public class StringTest08 {
    public static void main(String[] args) {
        String s1= "       Good Study, Day Up     ";
        System.out.println("s1 = " + s1);
        String s = s1.toLowerCase();
        System.out.println("s = " + s);
        String s2 = s.toUpperCase();
        System.out.println("s2 = " + s2);
        String trim = s.trim();
        System.out.println("trim = " + trim);
        boolean g = s.startsWith("G");
        System.out.println("g = " + g);
        boolean p = s.endsWith(" ");
        System.out.println("p = " + p);
        int u = s.indexOf("u");
        System.out.println("u = " + u);

    }
}
