package asjy.base.day13;

import asjy.base.day13.utils.DQL;
import asjy.base.day13.utils.DbUtils;

import java.sql.*;
import java.util.List;
import java.util.Date;

public class DQLDemo {
    public static void queryAll(){
        //获取驱动
        Connection conn = null;
        PreparedStatement pmst =null;
        ResultSet rs = null;
        String sql = "select id,name,password,addtime from tb_user";
        try {
            conn = DbUtils.getConn();
            pmst= conn.prepareStatement(sql);
            rs = pmst.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                Timestamp addtime = rs.getTimestamp("addtime");
                System.out.println("id:"+id+",name:"+name+",pass:"+password+",addtime["+addtime+"]");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DbUtils.freeDb(rs,pmst,conn);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void queryAllDQL() throws SQLException {
        String sql = "select id,name,password,addtime from tb_user";
        List<User> users = DQL.queryAll(sql);
        for (User user:users){
            System.out.println(user);
        }

    }
    public static void queryByNameAndPassword(User user) throws SQLException {
        String sql = "select id,name,password,addtime from tb_user where name=? and password=?";
        User userExsist = DQL.queryOne(sql, user.getName(), user.getPassword());
        System.out.println(userExsist);

    }
    public static void main(String[] args) {
        //测试查询所有
        try {
//            queryAllDQL();
        User user = new User("asjy2501061","123456",new Date());
        queryByNameAndPassword(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
