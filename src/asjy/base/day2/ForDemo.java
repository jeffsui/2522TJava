package asjy.base.day2;

public class ForDemo {
    public static void main(String[] args) {
        /**
         * for(初始条件;循环进入条件;步长){
         *    循环体
         * }
         */
        for (int i= 1;i<=10;i++){
            System.out.print(i+" ");
        }
        //
        System.out.println();
        int res = 0;
        for (int i=2;i<=100;i+=2){
            res+= i;
        }
        System.out.println(res);
        res = 0;
        for (int i=1;i<=100;i+=2){
            res+= i;
        }
        System.out.println(res);
    }
}
