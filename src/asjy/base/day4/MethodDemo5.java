package asjy.base.day4;

public class MethodDemo5 {
    public static void sum(int ... args){
        System.out.println("参数个数"+args.length);
        if(args.length>0){
            for (int i = 0; i <args.length ; i++) {
                System.out.println("第"+(i+1)+"个参数:"+args[i]);
            }
        }

    }
    public static void info(Object...args){
        System.out.println("参数个数"+args.length);
        if(args.length>0){
            for (int i = 0; i <args.length ; i++) {
                System.out.println("第"+(i+1)+"个参数:"+args[i].toString());
            }
        }
    }
    public static void main(String[] args) {
//        sum(10,30);
        info("hello",12,5.678,true);
    }
}
