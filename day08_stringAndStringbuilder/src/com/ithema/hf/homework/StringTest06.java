package com.ithema.hf.homework;

import java.util.Scanner;

public class StringTest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String tellString = sc.nextLine();
        String substring = tellString.substring(0, 3);
        String substring1 = tellString.substring(tellString.length() - 4);
        System.out.println(substring+"****"+substring1);
    }
}
