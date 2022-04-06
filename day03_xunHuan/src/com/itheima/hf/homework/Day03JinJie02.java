package com.itheima.hf.homework;
/*
**2、输出100以内（100）被6整除的数字，每5个换一行，**
如：6 12 18 24 32
​    36 42 48 54 60
​	    ......
 */
public class Day03JinJie02 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 6 == 0){
                System.out.print(i+" ");
                count++;
                if (count % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
