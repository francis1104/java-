package com.itheima.hf.homework;

/*操作步骤描述
1.创建一个测试类,在测试类中书写上述代码
2.定义方法可以接受一个int[] brr和一个int key
3.在方法中定义标记 int count = 0 ;
4.方法中遍历brr 对每个元素进行判断是否等于key,如果等于就打印索引值,并count++
5.遍历brr完毕之后 判断count的值,如果还为默认值0,则表示brr中没有key,直接打印”数组中没有这个数字”
6.在主方法中传入数组 arr 和数字 2 或者5 进行测试
定义一个方法，查找指定数字在数组中出现的索引(若出现多次，多次打印)
	如: 数组{1,2,3,2} 要查找的数是2 则方法内部会打印索引值 1   3
	数组{1,2,3,2} 要查找的数是5 则方法每部会打印 "数组中没有这个数字"*/
public class Day05JiChu05 {
    public static void main(String[] args) {
        int[] brr = {1, 2, 3, 2};
        testFind(brr, 2);

    }
    public static void testFind(int[] brr, int key) {
        int count = 0;
        for (int i = 0; i < brr.length; i++) {
            if (key == brr[i]) {
                System.out.println("index"+i+":"+key);
                count++;
            }
        }
        if (count==0){
            System.out.println("The number is not exist in array");
        }
    }
}
