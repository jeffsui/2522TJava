package asjy.base.day13;

import asjy.base.day13.dao.UserDAO;
import asjy.base.day13.dao.impl.UserDAOImpl;

import java.sql.SQLException;

public class Management {
    public UserDAO userDAO;
    public Management(){
        userDAO = new UserDAOImpl();
    }
   public boolean register(User user) throws SQLException {
        return userDAO.register(user)>0;
    }

    public boolean delete(User user) throws SQLException {
       return userDAO.deleteUser(user)>0;
    }

    public boolean login(User user) throws SQLException {
        return userDAO.login(user)!=null;
    }

    public boolean queryNameExsist(String name) throws SQLException {
        return userDAO.queryByName(name)==null;
    }
}
