package com.telran.berlin.pratice.Lesson5.scanner;

import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();


        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();

//        System.out.println("Nummer1 + number2 = " + (num1 + num2));
//        System.out.println("Nummer1 - number2 = " + (num1 - num2));

        System.out.println("number1 = " + num1 + "  " + "number2 = " + num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    }
}
