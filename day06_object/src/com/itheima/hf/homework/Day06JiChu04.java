package com.itheima.hf.homework;
/*分析以下需求，并用代码实现
	手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()
	要求:
		1.按照以上要求定义类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用三个成员方法,打印格式如下:
			正在使用价格为998元的小米品牌的手机打电话....
			正在使用价格为998元的小米品牌的手机发短信....
			正在使用价格为998元的小米品牌的手机玩游戏....*/
public class Day06JiChu04 {
    public static void main(String[] args) {
        Phone p = new Phone("xiaomi",998);
        p.call();
        p.sendMessage();
        p.playGame();
    }
}
class Phone{
    private String brand;
    private int price;
    public void call(){
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机打电话....");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机sendmessage....");
    }
    public void playGame(){
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机palygame....");
    }
    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}