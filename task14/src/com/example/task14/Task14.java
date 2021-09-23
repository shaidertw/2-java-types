package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        int reverseValue=0;
        while(value>0){
            reverseValue *= 10;
            reverseValue += value % 10;
            value/=10;
        }
        return reverseValue;
    }

    public static void main(String[] args) {

        int result = reverse(100000023);
        System.out.println(result);

    }


}
