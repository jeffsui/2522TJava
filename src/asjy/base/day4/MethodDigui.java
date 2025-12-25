package asjy.base.day4;

public class MethodDigui {
    public static void main(String[] args) {
        /**
         * 方法调用方法自身
         * 1. 不能无限递归
         * 2. 递归一定有一个退出条件
         *
         * 分析问题:
         * 1. 归纳/整理,提取通项公式
         * 2. 方法实现
         *
         * fib
         * 1 1 2 3 5 8 13 21 34 55 ...
         *
         */
        //1.递推
        System.out.println(getN(10));
        //2.递归
        System.out.println(getNDigui(10));
        //斐波那契额数列 第n个数
        for (int i = 1; i <=10 ; i++) {
            System.out.print(fib(i)+" ");
        }
    }

    private static int fib(int n) {
        if(n==1 || n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    private static int getNDigui(int n) {
        if (n==1){
            return 1;
        }else{
            return n+getNDigui(n-1);
        }
    }

    private static int getN(int n) {
        int res = 0;
        for (int i = 1; i <=n ; i++) {
            res+=i;
        }
        return res;
    }

}
