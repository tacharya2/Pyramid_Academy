package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Square computer = new Square();
        int result  = computer.computeM(3,4);
        System.out.println("(a + b)^2: " + result);

        result = computer.computeN(3,4);
        System.out.println("a^2 + b^2: " + result);

        Cube cu = new Cube();
        result = cu.computeM(3,4);
        System.out.println("(a + b)3: " + result);

        result = cu.computeN(3,4);
        System.out.println("(a - b)3: " + result);

        Line l = new Line();
        Scanner s = new Scanner(System.in);

        System.out.print("m: ");
        double m = s.nextDouble();
        System.out.print("x: ");
        double x = s.nextDouble();
        System.out.print("c: ");
        double c = s.nextDouble();
        double slope = l.line(m, x, c);
        System.out.println(slope);
    }
}
class Square {

   public int computeM(int a, int b) {
        return a * a + 2 * a * b + b * b;
    }
    public int computeN(int a, int b) {

       return (a + b)*(a + b) - 2 * a * b;
    }
}
class Cube{
    public int computeM(int a, int b){

        return a*a*a + b*b*b +3*a*b*(a+b);
    }
    public int computeN(int a, int b){

        return a*a*a - b*b*b -3*a*b*(a-b);
    }
}
class Line{
    public double line(double m, double x, double c){

        return m * x + c;
    }
}