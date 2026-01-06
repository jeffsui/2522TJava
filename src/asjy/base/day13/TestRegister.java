package asjy.base.day13;

import java.sql.SQLException;
import java.util.Scanner;

public class TestRegister {
    public static void main(String[] args) {
        Management management = new Management();
        Scanner input =new Scanner(System.in);
        System.out.print("输入用户名:");
        String name = input.next();
        System.out.print("输入密码");
        String password = input.next();
        User loginUser = new User(name,password);
        //验证重复密码
        //验证年龄 补全
        try {
            if(management.queryNameExsist(name)){
                if(management.register(loginUser)){
                    System.out.println("注册成功");
                }else{
                    System.out.println("注册失败");
                }
            }else{
                System.out.println("用户名已经存在");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
