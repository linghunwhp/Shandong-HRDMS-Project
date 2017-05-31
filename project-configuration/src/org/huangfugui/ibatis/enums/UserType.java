package org.huangfugui.ibatis.enums;

public enum UserType {

    ENTERPRISEUSER(0,"企业用户"),CITYUSER(1,"市用户"),PROVINCIALUSER(2,"省用户");

    private int id;
    private String name;

    UserType(int id,String name){
        this.id = id;
        this.name = name;
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
}