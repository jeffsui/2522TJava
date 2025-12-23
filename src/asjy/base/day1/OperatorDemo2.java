package asjy.base.day1;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /**
         * 赋值运算符
         * =
         *
         * 复合赋值运算符
         * += -= *= /= %=
         *
         *     前缀  后缀
         * 自增        先计算 后赋值
         * 自减        先赋值 后计算
         */
//        int num = 10;
//        num = num+1;
//        System.out.println(num);
//        System.out.println(++num);
//        System.out.println(num);
//        int num1 = 2024;
//        int num2 = 12;
//        System.out.print(""+num1+num2);
//        System.out.println(num1+num2);

        int num = 10;
        num+=2;
        System.out.println(num); //12
        num*=2; //num= num*2;
        System.out.println(num);

    }
}
