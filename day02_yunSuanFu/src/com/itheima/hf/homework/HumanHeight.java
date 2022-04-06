package com.itheima.hf.homework;

public class HumanHeight {
    public static void main(String[] args) {
        double fatherHeight = 177.0;
        double motherHeight = 165;
        double sonHeight = (fatherHeight+motherHeight)*1.08/2;
        double daughterHeight =(fatherHeight*0.923+motherHeight)/2;
        System.out.println("儿子的身高为"+sonHeight);
        System.out.println("儿子的身高为"+daughterHeight);
    }
}
