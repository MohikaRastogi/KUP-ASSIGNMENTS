package com.knoldus;

/**
 * A simple calculator class with add, subtract, multiply, and divide methods.
 */
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException divideByZero) {
            System.out.println("Cannot divide by zero");
            return -1;
        }
    }
}
