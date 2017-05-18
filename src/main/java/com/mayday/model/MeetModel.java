package com.mayday.model;

/**
 * Created by EricAi on 2017/5/12.
 *
 */
public class MeetModel {

    private int id;  //参会人员编号
    private String name;  //参会人员姓名
    private String level;  //参会人员职位

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public MeetModel(int id, String name, String level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public MeetModel() {
    }

    @Override
    public String toString() {
        return "MeetModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
