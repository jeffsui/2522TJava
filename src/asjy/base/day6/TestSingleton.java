package asjy.base.day6;

public class TestSingleton {
    public static void main(String[] args) {
        /**
         * 因为构造方法 private
         * 意味着外部无法通过new 创建当前类的实例
         */
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        System.out.println(singletonDemo);

        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        System.out.println(singletonDemo2);
    }
}
