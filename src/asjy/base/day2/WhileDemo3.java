package asjy.base.day2;

public class WhileDemo3 {
    public static void main(String[] args) {
        /**
         * continue
         * 根据条件,终止本次循环(未执行完的部分),继续执行下一次循环,直到循环结束
         *
         */
//        1-10 跳过5
        int n = 0;
        while(n<10){
            n++;
            if(n==5){
                continue;
            }
            System.out.println(n);
        }
    }
}
