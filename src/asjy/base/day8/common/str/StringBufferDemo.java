package asjy.base.day8.common.str;

public class StringBufferDemo {
    public static void main(String[] args) {
        /**
         * 可变字符串 StringBuffer 类: 线程安全
         * StringBuilder 类  : 不是线程安全
         *
         */
        StringBuffer stringBuffer = new StringBuffer("asjy");
        stringBuffer.append("org");
        stringBuffer.insert(0,".");
        stringBuffer.insert(5,".");
        stringBuffer.insert(0,"www.");
        System.out.println(stringBuffer.toString());
        //字符串翻转
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse.toString());

        StringBuilder stringbuilder = new StringBuilder("www");
    }
}
