package asjy.base.day3;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        //数组翻转
        int[] arr = {4,1,2,3,7};
        //翻转后数组  {7,3,2,1,4}
        /**
         * 镜像位,进行交换
         * 1. 交换条件
         * [0] -- [len-1]
         * [1] -- [len-1-1]
         * ...
         * [i] -- [len-1-i]
         * 2. 采用循环方式
         * 2.1 交换次数,数组长度
         * len/2 取整数
         */
        System.out.println(Arrays.toString(arr));
        int loopLen = arr.length/2;
        for (int i = 0; i <loopLen ; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }

        System.out.println("翻转后的数组:");
        for (int i:arr){
            System.out.print(i+" ");
        }

    }
}
