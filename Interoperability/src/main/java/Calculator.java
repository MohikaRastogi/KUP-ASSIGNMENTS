package com.knoldus;

/**
 * A simple calculator class with add, subtract, multiply, and divide methods.
 */
public class Calculator {
    public static int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public static int subtract(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public static int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public static int divide(int firstValue, int secondValue) {
        try {
            return firstValue / secondValue;
        } catch (ArithmeticException divideByZero) {
            System.out.println("Cannot divide by zero");
            return -1;
        }
    }
}
