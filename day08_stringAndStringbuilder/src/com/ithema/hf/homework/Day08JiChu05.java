package com.ithema.hf.homework;

import java.util.Scanner;

/***5、编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）**
 ​	1.若不符合要求，则提示用户重新输入直至符合要求为止
 ​	2.若符合要求，则判断字符串中大写字母出现次数并打印。*/
public class Day08JiChu05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串(必须含有字母):");
        while (true){
            String s = sc.nextLine();
            int count = 0;
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    count++;
                    num++;
                } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    num++;
                }
            }
            if (num == 0){
                System.out.println("您输入的字符串有误请重新输入:");
            }else{
                System.out.println("大写字母的次数为"+count+"次");
                break;
            }
        }
    }
}
