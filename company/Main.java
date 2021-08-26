package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Doctor doctor = new Doctor();
        doctor.name = "Ram";

        doctor.dosmothing();

        Janitor j = new Janitor("Tek", "3654 bcsb",25, "15456");

        EmployeeRegular er = new EmployeeRegular("Papa", "23655 Address Ave",19 );

        System.out.println(j.printInfo());
        System.out.println(er.printInfo());
        System.out.println(j.equals(er));
    }
}
