package asjy.base.day1;

import java.sql.SQLOutput;

public class TypeDemoEx {
    public static void main(String[] args) {
        /**
         * 整型 byte short int long
         * 小数 float double
         * 字符 char
         *
         */
        byte b = 127;
        b++ ; //自增 相当于 b= b+1
        System.out.println(b);
        short s1 = 12312;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        int number = 1231231231;
        System.out.println(number);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        long serialNumber = 1232132131L;
        System.out.println(serialNumber);
        //
        float f1 = 3.99F; //单精度浮点型
        System.out.println(f1);
        double d1 = 399.567; //双精度浮点型
        System.out.println(d1);

        String numberStr = "1000110111111011111";
//        Long.parseLong(numberStr);
            Float.parseFloat(numberStr);
    }
}
