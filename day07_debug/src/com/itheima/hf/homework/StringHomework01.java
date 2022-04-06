package com.itheima.hf.homework;

import java.util.Random;

/*"令狐冲, 风清扬,左冷禅,岳不群,苗人凤";
请使用所学知识设计程序帮助陈老师实现随机点名器功能训练目标
能够使用字符串的常用方法实现字符串的分割，遍历。
训练提示
1、老王丢下的人员名单是个很长的字符串，考虑通过逗号分割将大串转成数组操作比较方便。
2、班级人员名单的输出其实就是对分割后的字符串数组进行遍历，每输出两个就换一行。
3、随机点名其实就是利用随机数生成一个数组的随机索引，然后根据索引获取数组元素打印即可。
参考方案
使用随机数结合字符串相关API方法完成*/
public class StringHomework01 {
    public static void main(String[] args) {
        String s = "令狐冲,风清扬,左冷禅,岳不群,苗人凤";
        String[] split = s.split(",");
        System.out.println("本班人员名单如下:");
        for (int i = 0, count = 1; i < split.length; i++) {
            System.out.print(split[i] + " ");
            if (count % 2 == 0) {//每两个换一行
                System.out.println();
            }
            if (i == split.length - 1) {//最后一个索引换行
                System.out.println();
            }
            count++;
        }
        Random r = new Random();
        System.out.println("本次被选中的幸运同学是:" + split[r.nextInt(5)]);

    }
}
