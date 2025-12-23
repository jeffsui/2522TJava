package asjy.base.day2;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        /**
         * 双分支
         * condition 返回值 boolean表达式
         * if(condition){
         *     满足条件语句
         * }else{
         *     不满足条件语句
         * }
         */
        Scanner input = new Scanner(System.in);
        System.out.println("your age");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("允许参军");
        }else{
            System.out.println("不允许参军");
        }
        System.out.println("done");
    }
}
