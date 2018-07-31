package com.pandawork.common.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_person")
@Entity

public class Person {

    //person ID

    @Id
    public Integer id;

    //person姓名

    @Column(name = "person_name")
    private String name;

    //person生日

    @Column(name = "person_birthday")
    private int birthday;

    //person司职

    @Column(name = "person_department")
    private String department;

    //person球队

    @Column(name = "person_team")
    private String team;

    //person人物评价

    @Column(name = "person_comment")
    private String comment;


    //定义set,get方法

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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 需要把toString()方法重写。
     *
     * @return
     */
    @Override
    public String toString() {
        return "person{" + "name=" + name + '\'' +
                ", birthday=" + birthday +
                ", department='" + department + '\'' +
                ", team=" + team +
                ", comment='" + comment + '\'' +
                '}';
    }
}