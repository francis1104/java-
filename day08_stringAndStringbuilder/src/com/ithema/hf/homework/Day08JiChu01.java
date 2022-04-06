package com.ithema.hf.homework;

import java.util.Scanner;

/***1、字符串反转
 ​      举例：键盘录入”abc”
 ​     输出结果：”cba”
 ​       */
public class Day08JiChu01 {
    public static void main(String[] args) {
// ​     A:键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
// ​     C:调用方法
        reverse(s);
    }
    // ​ B:写方法实现字符串的反转
    public static void reverse(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
// ​     a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
//      b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
        for (int i = chars.length - 1; i >= 0; i--) {
            char i1 = chars[i];
            sb.append(i1);
        }
//      D:输出结果
        System.out.println("sb = " + sb);
    }
}


