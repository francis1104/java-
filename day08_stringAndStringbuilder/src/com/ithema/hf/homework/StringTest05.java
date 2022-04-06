package com.ithema.hf.homework;

import java.util.Scanner;
/*字符计次,大写字母,小写字母,数字,其他*/
public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                big++;
            } else if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= '0' && c <= '9') {
                num++;
            }else {
                other++;
            }
        }
        System.out.println("other = " + other);
        System.out.println("num = " + num);
        System.out.println("big = " + big);
        System.out.println("small = " + small);
    }
}
