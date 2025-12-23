package asjy.base.day1;

import java.awt.*;

public class TypeDemo {
    public static void main(String[] args) {
        /**
         * 类型
         * 1. 基本数据类型 8
         * 整型  byte short int long
         * 小数  float double
         * 字符  char
         * 布尔  boolean
         *
         * 2.引用数据类型
         * String
         *
         * 转义字符
         * \n 强制换行
         * \t 制表符 4个空格
         *
         * 变量
         *  目的: 存储数据 可以重复使用

         *  1. 声明/初始化: 先声明 初始化后 才能使用
         *  2. 可以重新赋值
         *
         * = 是赋值运算符
         *
         */
        int age = 19;
        System.out.printf("今年的年龄是 %d \n",age);
        age = age+1;
        System.out.printf("明年的年龄是 %d \n",age);

        byte a = 10;
        byte b = a;
        a++; //值传递
        System.out.printf("b=%d\n",b);

        Point p1 = new Point(1,1);
        Point p2 = p1;
        p1.x = 2;
        System.out.println(p1); //引用传递
        System.out.println(p2);



    }
}
