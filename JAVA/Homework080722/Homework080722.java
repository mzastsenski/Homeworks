package com.telran.berlin.practice.Lesson6.Homework080722;

import java.util.Scanner;

public class Homework080722 {
    public static void main(String[] args) {
        // 1.-2.
        float f = 3.9f;
        String cups = " cups";
        int b = (int) f;
        System.out.println(b + cups);
        int c = Math.round(f);
        System.out.println(c + cups);

        // 3.
        char k = 'K';
        char o = 'o';
        char l = 'l';
        char j = 'j';
        char a = 'a';
        System.out.println(String.valueOf(k) + String.valueOf(o) + String.valueOf(l) + String.valueOf(j) + String.valueOf(a));

        // 4.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N: ");
        int N = sc.nextInt();
        System.out.println("Enter number M: ");
        int M = sc.nextInt();
        System.out.println("Enter number K: ");
        int K = sc.nextInt();

        if (K < N * M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
