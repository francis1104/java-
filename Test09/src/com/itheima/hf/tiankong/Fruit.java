package com.itheima.hf.tiankong;
/**
 * 定义一个水果类Fruit，属性有：name（名字，String类型）和price(价格，int类型)
 */
public class Fruit {
    private String name;
    private int price;

    //提供空参满参构造方法
    public Fruit() {
    }

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //创建属性对应的set/get方法，
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
