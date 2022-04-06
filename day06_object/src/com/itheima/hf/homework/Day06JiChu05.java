package com.itheima.hf.homework;
/*分析以下需求，并用代码实现
	1.猫类Cat
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()
	2.狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
	要求:
		1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			花色的波斯猫正在吃鱼.....
			花色的波斯猫正在逮老鼠....
			黑色的藏獒正在啃骨头.....
			黑色的藏獒正在看家.....*/
public class Day06JiChu05 {
    public static void main(String[] args) {
        Cat c = new Cat("huase", "posimao");
        c.eat();
        c.catchMouse();
    }
}
class Cat{
    private String color;
    private String breed;
    public void eat(){
        System.out.println(color+"的"+breed+"正在eat");
    }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"正在逮老鼠....");
    }

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
class Dog{
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}