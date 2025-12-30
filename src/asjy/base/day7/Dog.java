package asjy.base.day7;

public class Dog extends APet{
    public Dog() {
    }

    public Dog(String type, int age) {
        super(type, age);
        System.out.println("子类Dog 有参构造");

    }

    @Override
    public void eat() {
        System.out.println(this.type+"喜欢吃骨头....");
    }

    public void watchHouse(){
        System.out.println(this.type+"看家护院...");
    }
}
