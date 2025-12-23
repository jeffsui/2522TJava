package asjy.base.day1;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        /**
         * 输入三位数
         * 取出各个位置上的数字
         */
        Scanner input = new Scanner(System.in);
        System.out.println("输入三位数：");
        int number = input.nextInt();
        int gewei = number%10;
        number = number/10;
        int shiwei = number%10;
        number = number/10;
        int baiwei = number%10;
//        int number = 132;
//        int baiwei = number/100;
//        int shiwei = number%100/10;
//        int gewei = number%100%10;

        System.out.println("百位"+baiwei+",十位"+shiwei+",各位"+gewei);
    }
}
