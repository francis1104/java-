package com.itheima.hf.homework;

/*已知某商场购物结算时支持如下三种结算方式：
1. 全额现金结算
2. 全额积分抵现，10积分 == 1元
3. 积分抵扣50元，剩余部分使用现金结算，10积分 == 1元
张三的账户积分余额为1000，现金余额为500，张三购买了80元商品，准备结算。
请设计程序定义三个方法（pay）分别模拟三种付款方式，在方法体中输出付款后的账户信息，并在主方法中完成方
法调用。*/
public class day05KuoZhan02 {
    public static void main(String[] args) {
//        pay(1000.0, 80);
//        pay(100,80);
        pay(100,10000,80);
    }

    public static void pay(double jiFen, double price) {
        if (jiFen / 10 < price) {
            System.out.println("您的积分不足");
        } else {
            jiFen = (jiFen / 10 - price) * 10;
            System.out.println("您的积分余额为:" + jiFen);
        }
    }

    public static void pay(int cash, double price) {
        System.out.println("支付成功,找零:" + (cash - price));
    }

    public static void pay(double cash, double jiFen, double price) {
        if (jiFen < 500) {
            System.out.println("积分不足");
            return;
        }
        jiFen -= 500;
        price -= 50;
        System.out.println("积分余额:" + jiFen);
        System.out.println("找零:" + (cash - price));
    }
}
