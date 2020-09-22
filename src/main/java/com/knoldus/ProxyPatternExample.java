package com.knoldus;

public class ProxyPatternExample {

    public static void main(String[] args) {
        College college = new ProxyStudent();
        college.attendance("Addi");
        college.attendance("Nikunj");
    }
}