package asjy.base.day4;

public class MethodDemo1 {
    public static void hello(String name){
        System.out.printf("hello %s\n",name);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        /**
         * 功能封装
          */
        hello("小明");
        //两个参数
        add(1,2);
    }
}
