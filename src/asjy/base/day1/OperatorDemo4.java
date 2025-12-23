package asjy.base.day1;

public class OperatorDemo4 {
    public static void main(String[] args) {
        /**
         * 关系运算符
         * > >=
         * < <=
         * ==
         * !=
         * 逻辑运算符
         * && 两个条件都成立,结果就成立;两个条件只要有一个为False,结果就是false
         * || 两个条件有一个条件成立,结果就成立;两个条件都为False,结果才是false
         * !
         */
        int num1=10;
        int num2 = 5;
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println("=====逻辑运算符========");
        System.out.println(num1>5 && num2<10);
        System.out.println(num1>10 && num2<10);
        System.out.println(num1>5 && num2<5);
        System.out.println(num1>10 && num2<5);

        System.out.println(num1>5 || num2<10);
        System.out.println(num1>10 || num2<10);
        System.out.println(num1>5 || num2<5);
        System.out.println(num1>10 || num2<5);


    }
}
