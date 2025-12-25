package asjy.base.day4;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,7};
        System.out.println(index(3,arr));
        Arrays.binarySearch(arr,3);
    }

    /**
     * 在数组中查找元素
     * @param ele 查找元素
     * @param arr 数组
     * @return 如果元素存在,则返回对应索引;不存在,则返回-1
     */
    private static int index(int ele, int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if(ele==arr[i]){
                return i ;
            }
        }
        return -1;
    }
}
