package com.itheima.hf.homework;

import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = sc.nextInt();
        if (score>100||score<0){
            System.out.println("您输入的成绩有误");
        }else{
            System.out.println((score > 60) ? "及格" : "不及格");
        }
    }
}
