package asjy.base.day2;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        /**
         * switch 多重分支 特例
         * 多个判断 进行 等值比较
         */
        Scanner input = new Scanner(System.in);
//        System.out.println("季节用1-4");
        int season = input.nextInt();
//        if(season==1){
//            System.out.println("春季");
//        }else if(season == 2){
//            System.out.println("夏季");
//        }else if(season == 3){
//            System.out.println("秋季");
//        }else if(season == 4){
//            System.out.println("冬季");
//        }else{
//            System.out.println("wrong season");
//        }
//        switch(season){
//            case 1:
//                System.out.println("春季");
//                break;
//            case 2:
//                System.out.println("夏季");
//                break;
//            case 3:
//                System.out.println("秋季");
//                break;
//            case 4:
//                System.out.println("冬季");
//                break;
//            default:
//                System.out.println("输入有误");
//                break;
//        }
        int score = input.nextInt();
        switch (score){
            case 1:
            case 2:
            case 3:
                System.out.println("D");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("C");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("B");
                break;
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
