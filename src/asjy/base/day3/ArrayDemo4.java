package asjy.base.day3;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        //根据行索引 列索引 访问二维列表中的元素
        System.out.println(arr[1][1]);
        //每个元素是一个数组
        System.out.println(arr[0]);
        //遍历二维列表
        int[] a = new int[6];
        int index = 0;
        for (int i = 0; i < arr.length; i++) { //行角标
            for (int j = 0; j < arr[i].length ; j++) { //列角标
                System.out.print(arr[i][j]+" ");
                a[index] = arr[i][j];
                index++;
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(a));
    }
}
