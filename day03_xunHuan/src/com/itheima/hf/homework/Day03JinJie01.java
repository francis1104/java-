package com.itheima.hf.homework;
//1、输出100以内（包括100）被6整除的数字
public class Day03JinJie01 {
    public static void main(String[] args) {
        for (int i = 1;i <= 100;i++){
            if (i % 6 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
