package asjy.base.day2;

import java.util.Scanner;

public class WhileDemo4 {
    public static void main(String[] args) {
        /**
         * 不知道循环次数的情况下
         * 输入若干个成绩,求这些成绩的和
         * 最高分
         * 最低分
         * 限定: 输入0 循环退出
         *
         * while 先判断后执行
         * do while 先执行在判断
         *
         * 设置一个表示 flag boolean
         */
        Scanner input = new Scanner(System.in);
        int res = 0;
        int count = 0;
        boolean flag= true;
        while(flag){
            System.out.println("输入成绩:");
            int score = input.nextInt();
            if(score==0){
//                break;
                flag= false;
            }
            count++;
            res+= score;
        }
        System.out.println(count+"个学生总成绩是"+res);
        System.out.println(count+"个学生平均成绩是"+res/count);
    }
}
