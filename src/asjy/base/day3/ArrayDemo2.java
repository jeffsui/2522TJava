package asjy.base.day3;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /**
         * 初始化方式二:
         * 数组中每个元素有初值
         * 整型数组:  0
         * 浮点数组: 0.0
         * 布尔数组: false
         *
         * 引用类型数组
         *  字符串数组 : null
         */
        int[] arr = new int[4];
        for (int i : arr){
            System.out.print(i+" ");
        }
        short[] arr2 = new short[4];
        long[] arr3 = new long[4];
        byte[] arr4 = new byte[4];
        System.out.println("\n浮点型数组");
        double[] dArr = new double[3];
        for (double d :dArr){
            System.out.print(d+" ");
        }
        System.out.println("\n字符数组");
        char[] chArr = new char[3];
        for (char ch:chArr){
            System.out.print("*"+ch+"*"+" ");
        }
        System.out.println("\n布尔数组");
        boolean[] boolArr = new boolean[4];
        for (boolean b:boolArr){
            System.out.print(b+" ");
        }
        System.out.println("\n字符串数组");
        String[] strArr = new String[3];
        for (String str:strArr){
            System.out.print(str+" ");
        }


    }
}
