package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String fromInt = Integer.toString(value);
        String string = new StringBuilder(fromInt).reverse().toString();

        return Integer.parseInt(string);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }

}
