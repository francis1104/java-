package com.itheima.hf.homework;

public class Human {
    String name;
    private int age;
    char sex;
    int phoneNum;
    String address;
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void study(){
        System.out.println("study");
    }
    public Human(){
        System.out.println("constructor");
    }
}
