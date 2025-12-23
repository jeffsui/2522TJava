package asjy.base.day3;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /**
         * 如何对数组动态赋值
         */
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[4];
        //填充数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第"+(i+1)+"个元素赋值:");
            int num = input.nextInt();
            arr[i] = num;
        }
        //数组遍历
        int res = 0;
        for (int i: arr){
            System.out.println(i);
            res+=i;
        }
        System.out.println("数组元素的和"+res);
        //求最大值
        int max = arr[0];
        int max_index = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }
        }
        System.out.println("最大值是"+(max_index+1)+"个元素,值是"+max);
        //求最大值
        int min = arr[0];
        int min_index = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
        }
        System.out.println("最小值是"+(min_index+1)+"个元素,值是"+min);
        System.out.println("平均值"+res/arr.length);

    }
}
