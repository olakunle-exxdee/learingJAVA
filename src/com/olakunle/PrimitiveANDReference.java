package com.olakunle;

public class PrimitiveANDReference {
    //    01
    public static void main(String[] args) {
        // write your code here
        int a = 10;
        int b = a;
        a = 100;
        System.out.println(a + "+" + b);
        Person alex = new Person("alex");
        Person susan = alex;
        System.out.println(alex.name + "+" + susan.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

    }

}
