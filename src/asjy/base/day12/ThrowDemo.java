package asjy.base.day12;

public class ThrowDemo {
    public static boolean gender(String sex) throws MyException{
        if(sex.equals("男")){
            return true;
        }else if(sex.equals("女")){
            return false;
        }else{
//            System.out.println("性别错误");
            MyException ex = new MyException("性别有误");
            throw ex;
        }
    }
}
