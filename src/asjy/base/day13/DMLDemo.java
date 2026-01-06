package asjy.base.day13;

import asjy.base.day13.utils.DML;
import asjy.base.day13.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DMLDemo {

    public static void addUser(){
        //添加记录
        Connection conn = null;
        try {
            conn = DbUtils.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String sql = "insert into tb_user values(default,'admin123','8907123',now())";
        //3. 获取PreparedStatement 对象
        PreparedStatement pmst =null;
        try {
            pmst = conn.prepareStatement(sql);
            int result = pmst.executeUpdate();
            if(result>0){
                System.out.println("add success");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (pmst!=null){
                try {
                    pmst.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void updateUser(){
        Connection conn = null;
        try {
            conn = DbUtils.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String sql = "update tb_user set password='666666' where id = 56";
        //3. 获取PreparedStatement 对象
        PreparedStatement pmst =null;
        try {
            pmst = conn.prepareStatement(sql);
            int result = pmst.executeUpdate();
            if(result>0){
                System.out.println("update success");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (pmst!=null){
                try {
                    pmst.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void deleteUser(){
        Connection conn = null;
        try {
            conn = DbUtils.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String sql = "delete from tb_user where  id = 56";
        //3. 获取PreparedStatement 对象
        PreparedStatement pmst =null;
        try {
            pmst = conn.prepareStatement(sql);
            int result = pmst.executeUpdate();
            if(result>0){
                System.out.println("delete success");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (pmst!=null){
                try {
                    pmst.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void addUserDML(User user) throws SQLException {
        String sql = "insert into tb_user values(default,?,?,?)";
        int res = DML.dml(sql,user.getName(),user.getPassword(),user.getAddtime());
        System.out.println(res>0?"添加成功":"添加失败");
    }

    public static void updateUserDML(User user) throws SQLException {
        String sql = "update tb_user set password=? where id = ?";
        int res = DML.dml(sql,user.getPassword(),user.getId());
        System.out.println(res>0?"修改成功":"修改失败");
    }
    public static void deleteUserDML(User user) throws SQLException {
        String sql = "delete from tb_user where  id = ?";
        int res = DML.dml(sql,user.getId());
        System.out.println(res>0?"删除成功":"删除失败");
    }
    public static void main(String[] args) {
//        addUser();
//        updateUser();
//        deleteUser();
        User user = new User("asjy250106","123456",new Date());
        try {
            addUserDML(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
