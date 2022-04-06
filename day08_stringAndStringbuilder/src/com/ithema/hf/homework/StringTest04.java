package com.ithema.hf.homework;

import java.util.Scanner;
/*键盘录入字符串转化字符数组,遍历字符数组*/
public class StringTest04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
