package com.ithema.hf.homework;

import java.util.Scanner;

public class StringTest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();//键盘录入一个String对象
        StringBuilder stringBuilder = new StringBuilder(s);//转换成StringBuiler
        String reverse = stringBuilder.reverse().toString();//反转字符串并且重新转换为String

        if (s.equals(reverse)){//调用String的equals方法和reverse比较得到一个布尔值为是否相等
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
