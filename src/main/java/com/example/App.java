package com.example;

public class App {

    public int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        App obj = new App();

        int a = 10;
        int b = 25;
        int c = 15;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Third Number: " + c);
        System.out.println("Largest Number: "
                + obj.findLargest(a, b, c));
    }
}