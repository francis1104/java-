package com.itheima.hf.homework;

import java.util.Scanner;

/*某幼儿园小班开学共入学5名小朋友，现在班主任老师要对各位小朋友的年龄进行登记，并计算出本班学生的平均年
龄。（注意：班级平均年龄 = 班级学员年龄总和 / 班级人数）
请编写程序模拟以上场景，要求定义两个方法分别完成小朋友年龄登记和小朋友年龄求和，并在主方法中完成方法的
调用，并根据公式计算出班级平均年龄，将结果输出打印到控制台。
注意：幼儿园小朋友的年龄应该是在[3，5]岁范围内，如果班主任不小心登记错了，要提醒重新登记。
*/
public class Day05KuoZhan01 {
    public static void main(String[] args) {
        int[] year = new int[5];
        account(year);
        int sum = testSum(year);
        int avg = sum/year.length;
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);
    }

    public static int testSum(int[] year) {
        int sum = 0;
        for (int i = 0; i < year.length; i++) {
            sum+=year[i];
        }
        return sum;
    }

    public static void account(int[] year) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < year.length; i++) {
            System.out.println("INPUTno."+(i+1));
            int temp = sc.nextInt();
            if (temp >= 3 && temp <= 5) {
                year[i] =temp;
            }else {
                System.out.println("This number is not correct");
                i--;
            }
        }
    }

}
