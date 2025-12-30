package asjy.base.day8.common.str;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

        char[] charArray = str2.toCharArray();
        for (char ch:charArray){
            System.out.print(ch+" ");
        }
        System.out.println();
        char[] newCharArr = {'a','s','j','y'};
        String str3 = new String(newCharArr);
        System.out.println(str3);

    }
}
