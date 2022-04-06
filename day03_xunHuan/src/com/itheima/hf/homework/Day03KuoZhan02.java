package com.itheima.hf.homework;

public class Day03KuoZhan02 {
    public static void main(String[] args) {
        int nuts = 1543;//原始核桃数
        int thrw = 0;//扔掉总和

        while(nuts>=1){//核桃数大于等于1开始吃核桃
            if (nuts % 2 != 0){//核桃不能被平分
                nuts--;//丢掉一个核桃
                nuts/=2;//吃掉一半核桃
                thrw++;//丢掉的核桃+1
            }else {
                nuts/=2;//能被平分,直接吃掉一半
            }
        }
        System.out.println(thrw);

    }
}
