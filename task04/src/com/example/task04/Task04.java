package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        if (operation.equals("+")) {
            return (float) a + b;
        }
        if (operation.equals("-")) {
            return (float) a - b;
        }
        if (operation.equals("/")) {
            return (float) a / b;
        }
        if (operation.equals("*")) {
            return (float) a * b;
        }

        return 0f;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
