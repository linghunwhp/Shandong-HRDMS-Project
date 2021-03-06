package org.huangfugui.ibatis.po;

import org.huangfugui.ibatis.enums.UserType;

public class User {

    private int userId;
    private String username;
    private String password;
    private UserType userType;

    private int userCity;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getUserCity() {
        return userCity;
    }

    public void setUserCity(int userCity) {
        this.userCity = userCity;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userType=" + userType +
                '}';
    }
}
