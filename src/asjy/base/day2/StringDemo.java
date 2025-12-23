package asjy.base.day2;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * equals 字符串比较 而不用==
         */
        String str = "hello123";
        String str2 = "hello123";
        System.out.println(str== str2);
        String str3 = new String("hello123");
        System.out.println(str == str3);
        System.out.println(str.equals(str3));
    }
}
