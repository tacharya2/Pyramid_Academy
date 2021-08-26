package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name?: ");
        String name = sc.next();
        System.out.print("Please enter a number up to which you want your range to be (n): ");
        int upper = sc.nextInt();

        while(upper <= 0){
            System.out.println("please enter a positive number above 0");
        }
        System.out.println("While," + name + ", I will guess your number between 0 and "+ (upper - 1) + " WITHIN 6 steps");
        System.out.println("Please help me doing so by indicating if I am too low, too high or just right. ");
        System.out.println("If I am too low, enter \"l\" ");
        System.out.println("If I am too high, enter \"h\" ");
        System.out.println("If I am correct, enter \"c\" ");
        System.out.println("Hang on with me!!");
        sc.close();
        solution(0, upper );
    }
    public static int solution(int lower, int upper){



        int mid = (int)(Math.ceil((double)(upper + lower)/2.0));

        Scanner sc = new Scanner(System.in);


        System.out.println("Is your number " + mid + "?");
        char response = sc.next().charAt(0);
        while(response != 'l' && response != 'h' && response != 'c'){
            System.out.println("Please enter {l, h, or c)");
        }
        System.out.println("Please enter c for correct, h for too high, or l for too low.");

        if(response == 'c'){
            System.out.println("Congratulations! you got it right.");
        }else if(response == 'h'){
            solution(lower, mid-1);
        }else{
            solution(mid+1, upper);
        }
        return 1;
    }

}
