package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        x=x+y;
        return String.valueOf(Math.abs(x)).length();
    }

    public static void main(String[] args) {

        int result = solution(120000, 345);
        System.out.println(result);

    }

}
