package com.itheima.hf.homework.ObjectTest;
/*编写一个Student类，包含name、gender、age、id、score属性，
分别为String、String、int、int、double类型。类中声明一个say方法，该方法用于展示对象的所有信息。
在另一个StudentTest类中的main方法中，创建Student对象，并给对象的每个属性进行设置值。
访问say方法、将对象的所有信息展示在控制台。*/
public class Student {
    private String name;
    private String gender;
    private int age;
    private int id;
    private double score;

    public Student() {
    }

    public Student(String name, String gender, int age, int id, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.score = score;
    }

    public void say(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("id = " + id);
        System.out.println("score = " + score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
