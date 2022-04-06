package com.itheima.hf.homework;

public class Day03JinJie05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9;i++){
            for (int j = 1; j <= 9;j++){
                if (j > i){
                    continue;
                }
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }
}
