package asjy.base.day13.utils;

import java.sql.*;

public class DbUtils {
    public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";
    static{
        //1.加载jdbc驱动
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取Connection对象
     * @return
     */
    public static Connection getConn() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

        return conn;
    }

    /**
     * 释放数据库资源
     * @param rs
     * @param pmst
     * @param conn
     * @throws SQLException
     */
    public static void freeDb(ResultSet rs,PreparedStatement pmst, Connection conn) throws SQLException {
        if(rs!=null){
            rs.close();
        }
        if(pmst!=null){
            pmst.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}
