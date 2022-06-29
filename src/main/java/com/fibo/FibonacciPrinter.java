package com.fibo;

import java.util.LinkedList;
import java.util.List;

public class FibonacciPrinter {
    private final Integer FROM;
    private final Integer TO;

    public FibonacciPrinter(Integer from, Integer to) {
        this.FROM = from;
        this.TO = to;
        getFibonacciNumbersByConstraint();
    }

    public List<Integer> getFibonacciNumbersByConstraint() {
        List<Integer> integers = new LinkedList<>();
        int n1 = 0;
        int n2 = 1;
        int temporary_variable;
        for (int i = 0; i <= TO; i++) {
            temporary_variable = n1 + n2;
            if (temporary_variable <= TO) {
                n1 = n2;
                n2 = temporary_variable;
                if (temporary_variable > FROM) {
                    integers.add(n2);
                }
            }
        }
        return integers;
    }
}