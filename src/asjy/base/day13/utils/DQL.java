package asjy.base.day13.utils;

import asjy.base.day13.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DQL {
    public static Connection conn  = null;
    public static PreparedStatement pmst = null;
    public static ResultSet rs =null;

    /**
     *
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     */
    private static ResultSet dql(String sql,Object ... args) throws SQLException {
        conn = DbUtils.getConn();
        pmst = conn.prepareStatement(sql);
        for (int i = 0; i <args.length ; i++) {
            pmst.setObject(i+1,args[i]);
        }
        rs = pmst.executeQuery();
        return rs;
    }

    /**
     * 根据条件查询所有用户信息,返回List
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     */
    public static List<User> queryAll(String sql, Object...args) throws SQLException {
        ResultSet rs = dql(sql, args);
        List<User> listUser = new ArrayList<>();
        while(rs.next()){
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setAddtime(new Date(rs.getTimestamp("addtime").getTime())); //sql.TimeStamp --> util.Date
            listUser.add(user);
        }
        return listUser;
    }

    /**
     * 根据条件查询单个用户信息,返回User对象
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     */
    public static User queryOne(String sql, Object...args) throws SQLException {
        return queryAll(sql,args).size()==0 ? null:  queryAll(sql,args).get(0);
    }
}
