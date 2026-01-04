package asjy.base.day12;

public class ExceptionFinallyDemo {
    public static void main(String[] args) {
        /**
         * try{
         *
         * }catch(){
         *
         * }finally{
         *
         * }
         */
        try{
            System.out.println("1.异常前的语句");
            System.out.println(0/2);
            System.out.println("2.异常后的语句");
        }catch (Exception ex){
            System.out.println("3.异常信息:"+ex.getMessage());
        }finally {
            System.out.println("4.无论是否捕获到异常,都会执行的语句");
        }
    }
}
