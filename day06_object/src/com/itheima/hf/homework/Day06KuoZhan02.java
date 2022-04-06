package com.itheima.hf.homework;
/*请定义一个描述正方形（Square）的类，包含一个属性边长（side），提供获取矩形周长（perimeter）和面积
（area）的方法。并编写测试类进行测试，要求使用两种方式创建对象并输出周长和面积。*/
public class Day06KuoZhan02 {
    public static void main(String[] args) {
        Square s = new Square();
        s.setSide(3.7);
        System.out.println("Perimeter ="+s.getPerimeter());
        System.out.println("Area ="+s.getArea());
        Square s1 = new Square(34.0);
        System.out.println("Perimeter ="+s1.getPerimeter());
        System.out.println("Area ="+s1.getArea());

    }
}
class Square{
    private double side;

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
