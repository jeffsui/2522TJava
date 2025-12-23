package asjy.base.day2;

public class SanMuDemo {
    public static void main(String[] args) {
        /**
         * condition? 满足条件: 不满足条件
         */
        int score = 66;
        if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        String res = score>=60?"及格":"不及格";
        System.out.println(res);
        System.out.println(Math.max(10,20));
    }
}
