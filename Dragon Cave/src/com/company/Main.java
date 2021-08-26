package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons.\n In front of you, you see two caves.");
        System.out.println("In One cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is  greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? Cave one or cave two.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Which cave are you willing to go for the gem?(1 or 2): ");
        int chosen = sc.nextInt();
        if(chosen == 1){
            System.out.println(caveOne(chosen));
        }if(chosen == 2){
            System.out.println(caveTwo(chosen));
        }
    }
    public static String caveOne(int c1){
        System.out.println("You approached the cave...");
        System.out.println("It is dark and spooky...");
        System.out.println("A large dragon jumped out and in front of you! He opened his jaws and...");
        System.out.println("Gobbles you down in one bite!");
        return "How do you feel?";
    }
    public static String caveTwo(int c2){
        System.out.println("The dragon approached roaring with his big mouth opened...");
        System.out.println("You are so scared of it..");
        System.out.println("It is coming closer and closer to you!");
        System.out.println("It opened its large paws and showed a gem that you were hunting forever...");
        return "How do you feel?";
    }
}
