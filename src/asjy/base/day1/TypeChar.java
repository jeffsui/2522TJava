package asjy.base.day1;

public class TypeChar {
    public static void main(String[] args) {
        /**
         * 可以进行类型转换 (值类型之间)
         *    1. 自动类型转换
         *      byte<short<int<long < float <double
         *      特例 ： char --> int
         *    2. 强制类型转换
         *      大--> 小
         * 不可以进行类型转换 例如 boolean 转int
         */
        char ch1 = 'a'; //'a' - 'z' 97 122
        char ch2 = 'A'; // 'A' - 'Z' 65 90
        System.out.println(ch1>ch2);
        //自动类型转换  字符可以转整数 (ascii)
        int iCh1 = ch1;
        System.out.println(iCh1);
        int iCh2 = ch2;
        System.out.println(iCh2);
        int intCh1 = 100;
        System.out.println(ch1>intCh1);
        System.out.println("======强制类型转换=============");
        double price = 398.5;
        int iPrice = (int) price;
        System.out.println(iPrice);
        boolean flag = true; //不能转换
//        int num = (int)flag;

    }
}
