package com.telran.berlin.practice.Lesson6.HomeWork220712;

public class HomeWork220712 {
    public static void main(String[] args) {
        // 1.
        String str = new String("I study Basic Java!");

        // 2.
        setString(str);

        // 3.
        char last = str.charAt(str.length() - 1);
        System.out.println(last);

        // 4.
        if (str.contains("Java")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 5.
        String s2 = str.replace("a", "o");
        System.out.println(s2);

        // 6.
        System.out.println(str.toUpperCase());

        // 7.
        System.out.println(str.toLowerCase());

        // 8.
        System.out.println(str.substring(str.length() - 5, str.length() - 1));

    }

    private static String setString(String a) {
        System.out.println(a);
        return a;
    }

}
