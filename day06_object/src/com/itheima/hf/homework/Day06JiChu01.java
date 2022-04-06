package com.itheima.hf.homework;
/*第一题 :
	学生的属性 : 姓名,性别,年龄,
	学生的行为 : 学习
	需求 :
		1 创建学生类 : 包含成员变量, 空参有参构造, setXxx/getXxx方法 和学习的方法
		2 创建测试类类中，包含main()方法，在main方法中创建三个学生对象，通过构造方法给成员变量赋值。
		3 打印每个对象的所有属性,行为可以不打印
		例如 :
			薛之谦	男		26		Java
			张碧晨	女		24		IOS
			张杰	男		28		Java
				*/
public class Day06JiChu01 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        s.setName("薛之谦");
        s.setAge(26);
        s.setGender('男');
        s.setSubject("Java");
        s1.setName("张碧晨");
        s1.setAge(24);
        s1.setGender('女');
        s1.setSubject("Ios");
        s2.setName("张杰");
        s2.setAge(28);
        s2.setGender('男');
        s2.setSubject("Java");
        s2.show();
        s.show();
        s1.show();

    }
}
class Student{
    private String name;
    private char gender;
    private int age;
    private String subject;

    public Student() {
    }

    public Student(String name, char gender, int age, String subject) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void show(){
        System.out.println(name+" "+gender+" "+age+" "+subject);
    }

}
