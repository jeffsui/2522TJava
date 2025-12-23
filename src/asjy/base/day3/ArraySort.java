package asjy.base.day3;

import java.util.Arrays;

public class ArraySort {

    public static void swap(int a ,int b){
        System.out.println("exchange before:"+a+","+b);
        int tmp = a;
        a =b ;
        b = tmp;
        System.out.println("exchange after:"+a+","+b);
    }
    public static void main(String[] args) {
        swap(10,20);
        int[] arr = {4,2,1,3,7};
        //升序排列
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i -1 ; j++) {
                //两个相邻元素比较,交换
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("排序后数组");
        for (int i :arr){
            System.out.print(i+" ");
        }

        int[] arr1 = {9,3,5,1,7};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
