package com.baizhi.entity;

public class Student {
    private int id;
    private String name;
    private int age;
    private int sexType;
    private String telephone;
    private String address;
    private int isDelete;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSexType() {
        return sexType;
    }

    public void setSexType(int sexType) {
        this.sexType = sexType;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sexType=" + sexType +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public Student(int id, String name, int age, int sexType, String telephone, String address, int isDelete) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sexType = sexType;
        this.telephone = telephone;
        this.address = address;
        this.isDelete = isDelete;
    }

    public Student() {
        super();
    }
}
