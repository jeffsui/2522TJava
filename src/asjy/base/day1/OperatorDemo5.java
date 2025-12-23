package asjy.base.day1;

public class OperatorDemo5 {
    public static void main(String[] args) {
        /**
         * 判断闰年
         * 1. 逢4必闰, 逢100不闰
         * 2. 逢400又闰
         */
//        int year = 2024;
//        System.out.println((year%4==0 && year%100!=0) || year%400==0);
        int num = 14;
        //ceil 向上取整
        System.out.println(Math.ceil(num));

    }
}
