package com.company;
import java.util.Scanner;
public class Main {

    static int houses = 0;

    public static int stickCalculator(int sticks){
        sticks = 6 + ((houses - 1) * 5);
        return sticks;
    }


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("how many matchstick houses do you want to make");
    houses = input.nextInt();
    int sticks = stickCalculator(houses);
    System.out.println("you need " + sticks + " matchsticks");
    }
}
