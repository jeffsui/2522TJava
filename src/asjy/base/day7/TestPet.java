package asjy.base.day7;

public class TestPet {
    public static void main(String[] args) {
        /**
         * 多态性
         * 1. 继承关系
         * 2. 子类必须重写父类方法
         * 3. 父类引用指向对子类对象
         */
//        APet pet  = null;
//        pet = new Cat("橘猫",3);
//        pet.eat();
        //向上转型: 编译看左边,执行看右边
//        Cat cat = new Cat("橘猫",3);
//        APet pet = cat;
//        pet.eat();
        //子类 --> 父类对象  向下转型 强制类型转换
        APet pet = new Dog("金毛",2);
        Dog dog  = (Dog) pet;
        dog.watchHouse();
        dog.eat();




    }
}
