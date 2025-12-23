package asjy.base.day3;

public class LoopLoopDemo {
    public static void main(String[] args) {
        /**
         * 循环嵌套
         * 1. 外层循环执行一次,里层循环执行若干次
         * 2. 外层循环退出,整个循环才退出
         *
         */
        //打印5行每行5个小星星
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5 ; i++) { //行
            for (int j = 0; j < i+1; j++) { //列
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        System.out.println("实现1-4数字组成不重复三位数");
        int count = 0;
        for (int i = 1; i <=4 ; i++) { //百位数字
            for (int j = 1; j <=4 ; j++) { //十位数字
                for (int k = 1; k <=4 ; k++) { //各位数字
                    if (i!=j && j!=k && i!=k){
                        int n = i*100+j+10+k;
                        System.out.println(n);
                        count++;
                    }
                }
            }
        }
        System.out.println("总共有"+count+"个不重复的三位数");
    }
}
