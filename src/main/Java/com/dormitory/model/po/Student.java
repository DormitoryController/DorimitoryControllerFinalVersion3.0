package com.dormitory.model.po;

/**
 * Created by war on 2017/4/17.
 */
public class Student {
    private Long id;
    private String name;
    private String sex;
    private String telephone;
    private String email;
    private String flatnum;
    private String dormnum;
    private String passwd;

    public Student(){

    }

    public Student(Long id, String name, String sex, String telephone, String email, String flatnum, String dormnum, String passwd) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.telephone = telephone;
        this.email = email;
        this.flatnum = flatnum;
        this.dormnum = dormnum;
        this.passwd = passwd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFlatnum() {
        return flatnum;
    }

    public void setFlatnum(String flatnum) {
        this.flatnum = flatnum;
    }

    public String getDormnum() {
        return dormnum;
    }

    public void setDormnum(String dormnum) {
        this.dormnum = dormnum;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", flatnum='" + flatnum + '\'' +
                ", dormnum='" + dormnum + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
