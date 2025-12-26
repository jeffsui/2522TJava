package asjy.base.day5;

public class LocalDemo {
    int number =10 ;
    public void showNumber(){
        /**
         * 方法里声明变量 是局部变量
         * 1. 必须要初始化后,才能使用
         */
        int number=20;
        System.out.println(number);
    }
    public void changeNum(int number){
        int num = number;
//        this.number =number;
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 10001;
        LocalDemo demo = new LocalDemo();
//        System.out.println(demo.number);
        demo.showNumber();
        demo.changeNum(num);
    }
}
