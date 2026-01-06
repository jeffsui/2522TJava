package asjy.base.day13;

public class Computer {
    public static int add(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) throws Exception {
        if(args.length<2){
            throw new Exception("参数只能2个");
        }else{
            System.out.println(add(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
        }

    }
}
