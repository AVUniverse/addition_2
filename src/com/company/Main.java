package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Method-1 to add two numbers 4+3

        System.out.println(4+3);

    // Method-2 to add two numbers 4+5

        int a=5;
        int b=4;
        System.out.println(a+b);

    // Method-3 to add two numbers 10+5

        int c=10, d=5;
        int sum = c+d;
        System.out.println(sum);

    // Method-4 to add any two numbers

        System.out.println("Enter two numbers");
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        int f = scan.nextInt();
        int g = e+f;
        System.out.println(g);

    }
}
