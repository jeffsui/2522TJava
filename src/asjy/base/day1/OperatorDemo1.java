package asjy.base.day1;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperatorDemo1 {
    public static void main(String[] args) {
        /**
         * 和 差 商 积 余
         * +  -  / *   %
         */
//        Scanner input =new Scanner(System.in);
//        System.out.println("first num:");
//        int num1 = input.nextInt();
//        System.out.println("second num:");
//        double num2 = input.nextDouble();
//        System.out.printf("a+b = %f\n",num1+num2);
//        System.out.printf("a-b = %f\n",num1-num2);
//        System.out.printf("a*b = %f\n",num1*num2);
//        System.out.printf("a/b = %f\n",num1/num2);
//        System.out.printf("a%%b = %f\n",num1%num2);
        //BigDecemal
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1+d2);
        // float double 进行运算 计算结果预期值 偏差
        // IEEE 浮点运算都是近似值
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2= new BigDecimal("0.2");
        System.out.println(b1.add(b2));

    }
}
