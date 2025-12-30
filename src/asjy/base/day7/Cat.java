package asjy.base.day7;

public class Cat extends APet{
    public Cat() {
    }

    public Cat(String type, int age) {
        super(type, age);
        System.out.println("子类 有参构造");

    }

    @Override
    public void eat() {
        System.out.println(this.type+"吃小鱼干...");
//        super.eat();
    }

    public void catchMouse(){
        System.out.println(this.type+"抓耗子....");
    }
}
