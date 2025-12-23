package asjy.base.day2;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        /**
         * 输入考试成绩(0-100)
         * 80-100 优秀
         * 70-80 良好
         * 60-70 及格
         * 0-60 不及格
         */
        Scanner input = new Scanner(System.in);
        System.out.println("input score:");
        int score = input.nextInt();
//        if(score>=80 && score<=100){
//            System.out.println("优秀");
//        }else if(score>=70 && score<80){
//            System.out.println("良好");
//        }else if(score>=60 && score<70){
//            System.out.println("及格");
//        }else if(score>=0 && score<60){
//            System.out.println("不及格");
//        }else{
//            System.out.println("输入非法");
//        }
        //先合法成绩区间
        if(score>=0 && score<=100){
            if(score>=80){
                System.out.println("优秀");
            }else if(score>=70){
                System.out.println("良好");
            }else if(score>=60){
                System.out.println("及格");
            }else if(score>=0){
                System.out.println("不及格");
            }
        }else{
            System.out.println("成绩非法");
        }
    }
}
