package com.eunjistudy.s01_method;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("main() 시작됨...");

        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨...");

    }

    public void methodA() {

        System.out.println("methodA() 호출함...");

        methodB();

        System.out.println("methodA() 종료됨...");
    }
    public void methodB() {
        System.out.println("methodB() 호출함...");

        methodC();

        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출함...");

        System.out.println("methodC() 종료됨...");
    }
}
