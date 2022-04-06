package com.itheima.hf.homework;

/*第20060期双色球开奖结果为：05 09 14 20 24 30 08，小明买的号是：08 09 14 20 24 30 05。
请设计程序帮助小明实现中奖梦想，要求使用两种方式实现首尾号码的交换，每种方式分别定义一个方法，在主方法
中调用测试。
*/
public class Day07KuoZhan01 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 14, 20, 24, 30, 8};
        change2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void change2(int[] arr) {
        arr[0] = arr[0] ^ arr[arr.length - 1];
        arr[arr.length - 1] = arr[0] ^ arr[arr.length - 1];
        arr[0] = arr[0] ^ arr[arr.length - 1];
    }

    public static void change1(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

}
