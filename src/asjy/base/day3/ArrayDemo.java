package asjy.base.day3;

public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * Java 数组: 引用数据类型
         * 静态数组： 初始化规定数组长度
         *
         */
        //初始化数组
        int[] arr = {4,2,1,3,7};
        System.out.println(arr);
        //访问数组 index: 0 ~  length-1
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        //获取数组长度
        System.out.println("arr length:"+arr.length);
        //修改对应索引位置元素的值
        arr[0] = 9;
        System.out.println("first ele change to :"+arr[0]);
        //超出数组索引值
//        System.out.println(arr[5]);
        //遍历数组：普通for循环
        for (int i = 0; i < arr.length; i++) { //i代表数组索引
            System.out.println("第"+(i+1)+"个元素:"+arr[i]);
        }
        //数组遍历: foreach循环(迭代器)
        for (int i:arr){ //i 代表数组中每个元素
            System.out.println(i);
        }

    }
}
