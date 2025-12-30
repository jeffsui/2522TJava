package asjy.base.day8.common.str;

import java.util.Arrays;

public class StringUsage {
    public static void main(String[] args) {
        String str = "www.asjy.org";
        System.out.println("字符串长度:"+str.length());
        String str2 = "www.ASJY.org";
        String str3 = "www.asjy.org;www.asjy.net";
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println("根据索引值获取对应字符:"+str.charAt(4));
        System.out.println("www开始"+str.startsWith("www"));
        System.out.println("org结束"+str.endsWith("org"));
        System.out.println("index查找字符串:"+str.indexOf("asjy")); //未找到返回-1
        System.out.println("index 设置开始位置查找字符串:"+str3.indexOf("asjy",12));
        System.out.println("lastindexof 从最后一次出现查找字符串:"+str3.lastIndexOf("asjy"));
        System.out.println("substring截取字符串"+str.substring(4));
        System.out.println("substring截取指定范围字符串"+str.substring(4,8)); //不包含有边界
        String demo = "美国-中国-英国";
        String[] split = demo.split("-");
        System.out.println(Arrays.toString(split));
        System.out.println("replace替换"+str.replace("asjy","python"));
        System.out.println("replaceAll替换"+str3.replaceAll("\\\\.(asjy)\\\\.","java"));
        String name =" admin ";
        System.out.println("去掉前后空格"+name.trim());
    }
}
