package com.learn.nolan.model.DO;

/**
 * description:
 *
 * @author zhun.huang 2018-12-17
 */
public class ManagerUserDO {

    private long id;

    private String userName;

    private String password;

    private int role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
