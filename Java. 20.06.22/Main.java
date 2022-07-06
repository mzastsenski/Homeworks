package com.telran.berlin.prasice;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.setName("Barsik");
        myCat.setBreed("pers");
        myCat.setAge(12);
        myCat.setColor("brown");

        System.out.println("My cat name is " + myCat.getName());
        System.out.println("My cat breed is " + myCat.getBreed());
        System.out.println("My cat is " + myCat.getAge() + " years old");
        System.out.println("My cat is " + myCat.getColor());

    }
}