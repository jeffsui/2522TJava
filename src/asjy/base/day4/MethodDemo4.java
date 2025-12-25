package asjy.base.day4;

import java.util.Arrays;

public class MethodDemo4 {
    public static String printArr(int[] arr){
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                res+=arr[i];
            }else {
                res += arr[i] + ",";
            }
        }
        res+="]";
        return res;
    }
    public static String printArr(double[] arr){
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                res+=arr[i];
            }else {
                res += arr[i] + ",";
            }
        }
        res+="]";
        return res;
    }
    public static void main(String[] args) {
        /**
         * 方法重载
         * 1. 在一个类中
         * 2. 方法名相同,参数不同
         *   参数类型、个数、顺序不同
         */
        int[] arr = {4,1,3,7,5};
//        Arrays.toString(arr);
        System.out.println(printArr(arr));
        double[] arrDouble = {4.2,3.6,4.5};
        System.out.println(printArr(arrDouble));
    }
}
