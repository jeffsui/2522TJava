package asjy.base.day4;

public class MethodDemo3 {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        /**
         * 1. 有返回值的方法,可以作为另一个方法的参数来使用
         * 2. 有返回值的方法,返回值类型
         * byte short int long float double boolean char String .....
         */
//        int res = add(1,add(2,3));
//        System.out.println(res);
        System.out.println(add(1,add(2,3)));
    }
}
