package asjy.base.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnDemo {
    public static void main(String[] args) {
        Connection connection =null;
        try {
            //1.加载jdbc驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取Connection连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8",
                    "root",
                    "root");
            if(connection!=null){
                System.out.println("Connected");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
