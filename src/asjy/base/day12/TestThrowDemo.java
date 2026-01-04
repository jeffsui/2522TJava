package asjy.base.day12;

public class TestThrowDemo {
    public static void main(String[] args)  {
        try{
            ThrowDemo.gender("未知");
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }

    }
}
