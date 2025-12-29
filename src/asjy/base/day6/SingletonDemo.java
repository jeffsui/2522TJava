package asjy.base.day6;

public class SingletonDemo {
    public  static SingletonDemo instance =null;
    private SingletonDemo(){

    }
    public static SingletonDemo getInstance(){
        if(instance==null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
