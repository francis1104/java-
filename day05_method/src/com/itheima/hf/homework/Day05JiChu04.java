package com.itheima.hf.homework;

/*4 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
	如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数
操作步骤描述
1.创建一个测试类
2.定义个方法可以接受一个int变量num 和 int型数组arr
3.在方法的内部统计num在arr中出现的次数(即统计arr中有多少个元素与num相等)
4.在主方法中调用这个方法传入一个数字,一个数组,得到数组的返回结果并打印*/
public class Day05JiChu04 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 5, 3, 9};
        int count = testCount(arr, 3);
        System.out.println("count = " + count);
    }

    public static int testCount(int[] arr, int i) {
        int count = 0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] == i) {
                count++;
            }
        }
        return count;
    }

}
