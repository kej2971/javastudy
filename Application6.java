package com.eunjistudy.s01_method;

public class Application6 {

    public static void main(String[] args) {

        System.out.println("main() 메소드 시작함");

        Application6 app6 = new Application6();
        app6.testMethod();

        String returnText = app6.testMethod();
        System.out.println(returnText);

        System.out.println(app6.testMethod());

        System.out.println("main() 메소드 종료됨");
    }

    public String testMethod() {

        return "hello world";
    }

}
