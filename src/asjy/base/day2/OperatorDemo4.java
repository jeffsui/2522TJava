package asjy.base.day2;

import java.util.Scanner;

public class OperatorDemo4 {
    public static void main(String[] args) {
        /**
         * 比较运算符
         *
         * 逻辑表达式
          */
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        //!逻辑取反
        String name = "admin";
        String pwd = "123456";
        Scanner input = new Scanner(System.in);
        System.out.println("输入用户名");
        String inputName = input.next();
        System.out.println("输入密码:");
        String inputPwd = input.next();
        if(!(inputName.equals(name) && inputPwd.equals(pwd))){
            System.out.println("登录失败");
        }else{
            System.out.println("登录成功");
        }

    }
}
