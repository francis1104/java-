package com.itheima.hf.tiankong02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //实例化三个Student对象
        Student s1 = new Student("小黑",88);
        Student s2 = new Student("小马",92);
        Student s3 = new Student("小智",75);
        //创建一个ArrayList集合，这个集合里面存储的是Student类型，分别将上面的三个Student对象添加到集合中
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int sum = 0;
        //遍历Arraylist集合，获取每个学生的成绩并求和
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
        }

        //求学生的平均成绩
        double avg = sum/3;
        System.out.println("三个学生成绩的平均值为："+avg);
    }
}
