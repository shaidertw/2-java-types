package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру

        return c-=32;
    }

    public static void main(String[] args) {

        char result = toUpperCase('b');
        System.out.println(result);

    }

}
