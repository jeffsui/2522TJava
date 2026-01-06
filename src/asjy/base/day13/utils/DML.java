package asjy.base.day13.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DML {
    public static Connection conn  = null;
    public static PreparedStatement pmst = null;

    /**
     * 执行增删改语句
     * @param sql 传入的sql语句,动态参数用?占位
     * @param args 需要传入?占位的参数,建议和Java实体类一一对应
     * @return 影响记录的条数,值>0
     * @throws SQLException
     */
    public static int dml(String sql,Object ... args) throws SQLException {
        conn = DbUtils.getConn();
        int result = 0;
        try {
            pmst = conn.prepareStatement(sql);
            //动态传参
            for (int i = 0; i < args.length; i++) {
                pmst.setObject(i+1,args[i]);
            }
            result =  pmst.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}
