package org.example.debugtest;

import org.example.debugtest.util.Calculator;

public class Example01 {

    public static void main(String[] args) {
        int n =0;
        while (n <10) {
            n = Calculator.add(n, 1);
        }
        System.out.println("EXIT");
    }
}
