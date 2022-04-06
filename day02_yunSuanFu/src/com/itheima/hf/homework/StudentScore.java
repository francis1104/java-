package com.itheima.hf.homework;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Java的成绩:");
        int javaScore = sc.nextInt();
        System.out.println("请输入SQL的成绩:");
        int sqlScore = sc.nextInt();
        System.out.println("请输入Web的成绩:");
        int webScore = sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("java    SQL    Web");
        System.out.println(javaScore+"      "+sqlScore+"     "+webScore);
        System.out.println("-------------------------");
        System.out.println("Java和SQL的成绩差:"+(javaScore-sqlScore));
        System.out.println("三门课的平均分是:"+((javaScore+sqlScore+webScore)/3.0));

    }
}
