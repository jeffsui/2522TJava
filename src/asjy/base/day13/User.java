package asjy.base.day13;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String password;
    private Date addtime;

    public User() {
    }

    public User(String name, String password, Date addtime) {
        this.name = name;
        this.password = password;
        this.addtime = addtime;
    }

    public User(int id, String name, String password, Date addtime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.addtime = addtime;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", addtime=" + addtime +
                '}';
    }
}
