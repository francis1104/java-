package com.ithema.hf.homework;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i >= 1; i--) {
            System.out.println("请输入用户名:");
            String scName = sc.nextLine();
            System.out.println("请输入密码:");
            String scPassword = sc.nextLine();
            if (username.equals(scName) && password.equals(scPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i==1){
                    System.out.println("登录失败,请明天再试.");
                }else{
                    System.out.println("登录失败,还有次"+(i-1)+"机会");
                }
            }
        }
    }
}
