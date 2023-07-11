package com.eunjistudy.s01_method;

public class Application9 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);

        System.out.println("두 수 중 최소값은 : " + min);

        int max = Calculator.maxNumberOf(first, second);

        System.out.println("두 수 중 최대값은 : " +max);
    }
}

