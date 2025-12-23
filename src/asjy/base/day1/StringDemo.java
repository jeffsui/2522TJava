package asjy.base.day1;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * String ""
         * str + str : 字符串拼接
         * 数值 + : 求和
         * tips:
         *  + 前后 如果有字符串,都是字符串拼接
         *  可以用括号改变运算符优先级
         */
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1+str2);
        int year = 2025;
        int month = 12;
        System.out.println(str1+(year+month));

        int a = 10;
        int b = 10;
        //逻辑表达式 结果 是boolean
        // == 比较运算符
        System.out.println(a == b);
        //字符串比较 equals()
        String str3 = "Hello";
        String str4 = new String("Hello");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

    }
}
