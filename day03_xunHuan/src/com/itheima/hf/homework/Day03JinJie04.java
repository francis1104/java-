package com.itheima.hf.homework;
/*
**4、有一个输出语句System.out.print("@")。使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：**
@@@@@
@@@@@
@@@@@
@@@@@
 */
public class Day03JinJie04 {
    public static void main(String[] args) {
        for (int i = 1;i <= 4;i++){
            for (int j = 1;j <= 5;j++){
                System.out.print("@");
            }
            System.out.println();
        }


    }
}
