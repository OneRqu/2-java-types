package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if (Float.compare(a, b) == 0) return true;

        if (Float.isNaN(a) || Float.isNaN(b) || Float.isInfinite(a) || Float.isInfinite(b)) return false;

        float epsilon = 0.0f;

        if (precision > 0) {
            epsilon = 1.0f;
            for (int i = 0; i < precision; i++) {
                epsilon /= 10.0f;
            }
        }

        return Math.abs(a - b) <= epsilon;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
