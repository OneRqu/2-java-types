package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        long number = (long) x + y;
        int count = 0;

        if (number == 0) {
            return 1;
        }

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
