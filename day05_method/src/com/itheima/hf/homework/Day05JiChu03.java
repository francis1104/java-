package com.itheima.hf.homework;

/*3 主方法中给定数组int[] arr= {20,10,40,30,50,60};
    定义一个方法可以接受这个给定的数组
	并返回这个数组中元素的最小值
操作步骤描述
1.创建一个测试类,在测试类中写该方法
2.定义一个方法可以接收一个整型的一维数组
3.在方法内部求出数组元素的最小值,并把这个最小值返回
4.在主方法中调用上述方法传递数组arr,得到数组中元素的最小值并打印*/
public class Day05JiChu03 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30, 50, 60};
        int min = testMin(arr);
        System.out.println("min = " + min);
    }
    private static int testMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
