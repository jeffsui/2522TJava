package asjy.base.day7;

public abstract   class APet {
    protected String type;
    protected int age;
    public APet(){
        System.out.println("抽象类【父类】默认无参构造");
    }

    public APet(String type, int age) {
        this.type = type;
        this.age = age;
        System.out.println("父类有参构造");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 抽象方法 eat()
     */
    public abstract void eat();

    public void play(){
        System.out.println(this.type+"在玩儿....");
    }
}
