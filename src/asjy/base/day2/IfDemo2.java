package asjy.base.day2;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /**
         * 多重分支:
         * if(condition1){
         *  满足条件1
         * }else if(condition2){
         *   满足条件2
         * }
         * .....
         * else{
         *  上述条件都不满足
         * }
         * 分支嵌套:
         * if(condition1){
         *    if(condition2){
         *        ...
         *    }
         * }....
         *
         * 男子组 进入决赛 9.9
         * 女子组 进入决赛 10.2
         */
        Scanner input = new Scanner(System.in);
        System.out.println("输入性别:");
        String sex  = input.next();
        System.out.println("输入成绩:");
        double score =  input.nextDouble();
//        if(sex.equals("男")){
//            if(score<=9.9){
//                System.out.println("进入男子组决赛"+score);
//            }else{
//                System.out.println("未进入男子组决赛"+score);
//            }
//        }else if(sex.equals("女")){
//            if(score<=10.2){
//                System.out.println("进入女子组决赛");
//            }else{
//                System.out.println("未进入女子组决赛");
//            }
//        }else{
//            System.out.println("性别有误,取消比赛成绩");
//        }
        if(sex.equals("男")){
            if(score<=9.9){
                System.out.println("man pass ");
            }else{
                System.out.println("man not pass");
            }
        }else{
            if(sex.equals("女")){
                if(score<=10.2){
                    System.out.println("woman pass");
                }else{
                    System.out.println("woman not pass");
                }
            }else{
                System.out.println("sex  is valid");
            }
        }

    }
}
