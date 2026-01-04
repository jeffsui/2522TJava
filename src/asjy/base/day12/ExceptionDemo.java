package asjy.base.day12;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("before exception");
        try{
            try{//包裹可能异常的语句
                System.out.println(2/0);

            }catch (ArithmeticException e){//捕获对应的异常,如果没有捕获到对应异常,还是会导致程序中断
                //处理异常
                System.out.printf("除数不能为零异常 %s\n",e.getMessage());
            }
            try{
                String numStr = "a";
                System.out.println(Integer.parseInt(numStr));
            }catch (NumberFormatException e){
                System.out.println("字符串转整数异常:"+e.getMessage());
            }
        }catch (Exception ex){
            System.out.println("其他异常"+ ex.getMessage());
        }


//        int[] arr = {4,1,3};
//        System.out.println(arr[3]);
        System.out.println("after exception");
    }
}
