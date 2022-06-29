package com.fibo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FibonacciPrinter fibonacciPrinter = new FibonacciPrinter(11, 59);
        System.out.println(fibonacciPrinter.getFibonacciNumbersByConstraint());
    }
}
