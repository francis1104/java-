package com.itheima.hf.homework;

import java.util.Scanner;

public class Day06KuoZhan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        System.out.println("请选择您要计算的图形:");
        System.out.println("0:正方形  1:长方形  2:圆形");
        switch (sc.nextInt()){
            case 0:
                System.out.println("请输入正方形的边长:");
                double side = sc.nextInt();
                s.setSide(side);
                System.out.println("正方形的周长是:"+s.getPerimeter());
                System.out.println("正方形的面积是:"+s.getArea());
                break;
            case 1:
                System.out.println("请输入长方形的宽:");
                double wide = sc.nextInt();
                System.out.println("请输入长方形的高:");
                double high = sc.nextInt();
                r.setWide(wide);
                r.setHigh(high);
                System.out.println("长方形的周长是"+r.getPerimeter());
                System.out.println("长方形的面积是"+r.getArea());
                break;
            case 2:
                System.out.println("请输入圆的半径:");
                double radius = sc.nextInt();
                c.setRadius(radius);
                System.out.println("圆的周长是:"+c.getPerimeter());
                System.out.println("圆的面积是:"+c.getArea());
            default:
                System.out.println("您的输入有误!");
        }
    }
}
class Rectangle{
    private double wide;
    private double high;

    public double getPerimeter(){
        return (wide+high)*2;
    }

    public double getArea(){
        return wide*high;
    }

    public Rectangle() {
    }

    public Rectangle(double wide, double high) {
        this.wide = wide;
        this.high = high;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
class Circle{
    private double radius;

    public double getPerimeter(){
        return 2*radius*3.14;
    }
    public double getArea(){
        return radius*radius*3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}