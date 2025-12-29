package asjy.base.day6;

public class StaticDemo {
    public int score;
    public static int number = 100;
    static{
        System.out.println("静态代码块");
    }
    public StaticDemo(){
        System.out.println("默认无参构造");
    }
    public static void show(){
        System.out.println(number);
//        System.out.println(score);
    }
    public  void info(){
        System.out.println(score);
        System.out.println(number);
    }

    public static void main(String[] args) {
        /**
         * 静态代码块
         * 1. 先于构造方法执行
         * 2. 只调用一次
         * 构造方法 创建对象的时候被调用一次
         */
//        System.out.println(StaticDemo.number);
//        StaticDemo.show();
        StaticDemo demo = new StaticDemo();
//        demo.info();
        StaticDemo demo1 = new StaticDemo();
    }
}
