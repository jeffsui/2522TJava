package asjy.base.day1;

import java.util.Scanner;

public class ShuRuDemo {
    public static void main(String[] args) {
        /**
         * 变量命名规范
         * 1. 字母 数字 下划线 $
         * 2. 不能以数字开头
         * 3. 区分大小写
         * 4. 命名不能和Java中保留关键字重名
         * 5. 命名要有意义,遵循小驼峰命名法  例如 strName  schoolNumber
         */
//        int $1 = 10;
//        int b = 20;
        Scanner input  = new Scanner(System.in);
        System.out.print("your name:");
        String name = input.next();
        System.out.println("your age:");
        int age = input.nextInt();
        System.out.println("your score:");
        double score = input.nextDouble();
        System.out.println("your flag:");
        boolean flag = input.nextBoolean();
        System.out.printf("姓名是：%s,年龄是 %d 岁,成绩是%.1f 分,是否工作:%B",name,age,score,flag);

    }
}
