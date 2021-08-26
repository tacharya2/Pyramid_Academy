package com.company;

public class EmployeeRegular  {
    private  String name;
    private String address;
    private int age;

    public EmployeeRegular(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printInfo(){
        return this.age + " " + this.address;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
