package com.kodilla.kalkulator;

public class Calculator {

    public static String addition(int a, int b) {
        int sum = a + b;
        return a + " + " + b + " = " + sum;
    }

    public static String subtraction(int a, int b) {
        int dif = a - b;
        return a + " - " + b + " = " + dif;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        System.out.println(addition(a,b));
        System.out.println(subtraction(a,b));

    }


}
