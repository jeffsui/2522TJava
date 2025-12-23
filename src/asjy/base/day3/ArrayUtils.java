package asjy.base.day3;

import java.util.Arrays;

public class ArrayUtils {
    public static void reverseArr(int[] arr){
        int loopLen = arr.length/2;
        for (int i = 0; i <loopLen ; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,2,7};
        Arrays.sort(arr);
        reverseArr(arr);//降序
        System.out.println(Arrays.toString(arr));
    }
}
