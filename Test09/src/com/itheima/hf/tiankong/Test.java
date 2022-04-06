package com.itheima.hf.tiankong;

import java.util.ArrayList;

/**
 * 定义一个Test类，Test类中包含2个方法：editPrice和main方法，2个方法的定义具体如下：
 * <p>
 * 定义int editPrice(ArrayList<Fruit> list,int price)静态方法，方法内要求完成：
 * <p>
 * 遍历指定集合list，如果list中元素的价格小于指定数值price，就将该元素的价格修改成price，并返回被修改水果的个数。
 * <p>
 * 创建main方法进行测试，方法内要求完成：
 * <p>
 * 添加3个Fruit对象到ArrayList集合list中，3个对象对应的属性值为："香蕉",8  "西瓜",9  "苹果",10；
 * <p>
 * 调用方法editPrice传入list和price，在控制台输出修改的水果个数。
 */
public class Test {
    public static void main(String[] args) {
        // 使用满参构造创建三个Fruit对象"香蕉",8  "西瓜",9  "苹果",10。
        Fruit fruit = new Fruit("香蕉", 8);
        Fruit fruit1 = new Fruit("西瓜", 9);
        Fruit fruit2 = new Fruit("苹果", 10);
        // 定义指定的价格price。
        int price = 9;
        // 创建集合。
        ArrayList<Fruit> list = new ArrayList<>();
        // 接收方法的返回值。
        int i = 0;
        // 集合添加元素 。调用editPrice方法，传入集合以及要修改成的价格，并接收。
        list.add(fruit);
        list.add(fruit1);
        list.add(fruit2);
        i = editPrice(list, price);
        // 打印修改的个数。
        System.out.println("一共修改了" + i + "个");
    }

    static int editPrice(ArrayList<Fruit> list, int price) {
        // 计数器。
        int count = 0;

        // 遍历参数中集合list，如果list中元素的价格小于指定数值price，就将该元素的价格修改成price，计数器增加次数。
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < price) {
                list.get(i).setPrice(price);
                count++;
            }
        }

        // 返回个数。
        return count;
    }
}
