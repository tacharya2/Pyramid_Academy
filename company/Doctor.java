package com.company;

public class Doctor extends Employee{

    @Override
    void dosmothing() {
        System.out.println(this.name + " Checks patient");
    }
}
