package org.example;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.print("enter the number of times to flip the coin: ");
        int count = 0, counthead = 0, counttail = 0; //Initialization.
        Scanner flip = new Scanner(System.in); //Creating Object for Scanner class.
        int num = flip.nextInt();
        //checking for the no. of flips greater than zero or not
        if (num > 0) {
            while (count <= num) {
                //probability for head or tail.
                if (Math.random() < 0.5) {
                    counttail += 1;
                } else {
                    counthead += 1;
                }
                count += 1;
            }
            double t = ((double) counttail / num) * 100;
            double h = ((double) counthead / num) * 100;
            //Percentage for head and tail.
            System.out.println("Heads flip percentage= " + h + "%");
            System.out.println("Tails flip percentage= " + t + "%");
        } else {
            System.out.println("invalid data entered");
        }
    }
}