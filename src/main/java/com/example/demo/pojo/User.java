package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @creatdate 2019-05-11 14:02
 */
public class User {
    private  String  name;
    @JsonIgnore
    private  String  password;
    private  int age;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private  String  desc;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date birthday;

    public User(String name, String password, int age, String desc, Date birthday) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.desc = desc;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
