package org.example;

public class Main {
    public static void main(String[] args) {
        // What will be printed?

        int a = 18;
        int b = 13;
        int c;
        String str = ""+a+b;

        c = a+b+a++ +b++ + ++a+ ++b;

        System.out.println(str);
        System.out.println(c);
    }
}