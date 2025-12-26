package asjy.base.day5;

public class TestStu2 {
    public static void main(String[] args) {
        /**
         * 构造特征:
         * 1. 与类名相同,没有返回值 没有void
         * 2. 类中可以有多个构造方法,方法参数不能相同 (构造方法重载)
         * 构造作用
         * 1. 创建当前类的实例,自动被调用的
         * 2. 给成员变量赋值
         */
        Student stu = new Student();
        stu.show();

        Student stu2 = new Student("小李",99.0);
        stu2.show();
    }
}
