package com.atguigu.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * Date:2022/7/1
 * Author:ybc
 * Description:
 */
public class Student {

    private Integer sid;

    private String sname;

    private Integer age;

    private String gender;
    private double sorce;

    public double getSorce() {
        return sorce;
    }

    public void setSorce(double sorce) {
        this.sorce = sorce;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(Integer sid, String sname, double sorce,String gender ) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.sorce = sorce;
    }

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", sorce=" + sorce +
                '}';
    }
}
