package asjy.base.day1;

public class InputDemo {
    public static void main(String[] args) {
        /**
         * 输出语句
         * System.out.println() 默认换行输出
         * System.out.print() 不换行输出
         * 快捷方式  sout 回车
         * 格式化输出
         *  System.out.printf
         *  占位符 %d 整数 %f 小数 %s 字符串 %c 字符
         */
        System.out.print("Hello");
        System.out.println(" world");
        System.out.println(123);
        System.out.println(4.414);
        System.out.println('A');
        System.out.println(true);
        System.out.printf("age is :%d,name is %s, score is %.1f, sex is %c ",20,"小明",98.56,'男');

    }
}
