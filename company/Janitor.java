package com.company;

public class Janitor extends EmployeeRegular{

    private String phone;
    public Janitor(String name, String address, int age, String phone) {
      super(name, address, age);
      this.phone = phone;
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }


}
