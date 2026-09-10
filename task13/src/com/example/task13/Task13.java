package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        c = Character.toUpperCase(c);
        //return (char) (c - 32);

        return c;
    }

    public static void main(String[] args) {

        char result = toUpperCase('x');
        System.out.println(result);

    }

}
