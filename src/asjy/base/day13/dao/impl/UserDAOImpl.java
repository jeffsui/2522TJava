package asjy.base.day13.dao.impl;

import asjy.base.day13.User;
import asjy.base.day13.dao.UserDAO;
import asjy.base.day13.utils.DML;
import asjy.base.day13.utils.DQL;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public int register(User user) throws SQLException {
        String sql = "insert into tb_user values(default,?,?,now())";
        int result = DML.dml(sql, user.getName(), user.getPassword());
        System.out.println("register result"+result);
        return result;
    }

    @Override
    public int deleteUser(User user) throws SQLException {
        String sql = "delete from tb_user where id = ?";
        return DML.dml(sql,user.getId());
    }

    @Override
    public User login(User user) throws SQLException {
        String sql = "select id,name,password,addtime from tb_user where name=? and password=?";
        return DQL.queryOne(sql,user.getName(),user.getPassword());
    }

    @Override
    public List<User> listUser() throws SQLException {
        String sql = "select id,name,password,addtime from tb_user";
        return DQL.queryAll(sql);
    }

    @Override
    public User queryByName(String name) throws SQLException {
        String sql = "select id,name,password,addtime from tb_user where name=?";
        return DQL.queryOne(sql,name);
    }
}
