package asjy.base.day13.dao;

import asjy.base.day13.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    public int register(User user) throws SQLException;
    public int deleteUser(User user) throws SQLException;
    public User login(User user) throws SQLException;
    public List<User> listUser() throws SQLException;
    public User queryByName(String name) throws SQLException;
}
