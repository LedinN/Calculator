package com.calculator.nick;

public class Calculator {

    public int Add(int a, int b) {
        return a + b;
    }

    public int Subtract(int a, int b) {
        return a - b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }

    public int Divide(int a, int b) {
        return a / b;
    }

    public double SquareRoot(int a) {
        return Math.sqrt(a);
    }

    public double Circumference(int a) {
        return 2 * Math.PI * a;
    }

    public double AreaofCircle(int a) {
        return Math.PI * Math.pow(a, 2);
    }
}
