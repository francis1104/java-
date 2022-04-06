package com.itheima.hf.homework;

/*1 定义一个方法 能接受一个整数(这个整数大于3) 打印0到这个整数(包含)之间的所有的偶数
	如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
	如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4
	操作步骤描述
	1.创建一个测试类,在测试类中创建上述方法
	2.定义一个无返回值,有参数的方法
	3.在方法内部把符合条件的数字打印
	4.在主方法中调用这个方法,并传入数字15进行测试*/
public class Day05JiChu01 {
    public static void main(String[] args) {
        test(15);
    }

    public static void test(int i) {
        for (int a = 0; a < i; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}
