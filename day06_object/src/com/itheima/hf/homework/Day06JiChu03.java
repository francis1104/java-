package com.itheima.hf.homework;
/*分析以下需求，并用代码实现
	1.程序员类Coder
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
	要求:
		1.按照以上要求定义Coder类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			工号为135基本工资为10000的程序员张三正在努力的写着代码......
*/
public class Day06JiChu03 {
    public static void main(String[] args) {
        Coder c = new Coder("zhangsan",123,34);
        c.work();
        Coder c1 = new Coder();
        c1.setId(234);
        c1.setName("lisi");
        c1.setSalary(34242);
        System.out.println("工号为"+c1.getId()+"基本工资为"+c1.getSalary()+"的程序员"+c1.getName()+"正在努力的写着代码......");
    }
}
class Coder{
    private String name;
    private int id;
    private int salary;

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写着代码......");
    }

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
