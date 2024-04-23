package com.calculatorTest.nick;

import com.calculator.nick.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Addition")
    public void TestAdd() {
        int a = 5;
        int b = 2;
        int result = calculator.Add(a,b);
        assertEquals(7,result,"5 + 2 = 7");
    }

    @Test
    @DisplayName("Test Substraction")
    public void TestSubstraction() {
        int a = 5;
        int b = 2;
        int result = calculator.Subtract(a,b);
        assertEquals(3, result, "5 - 2 = 3");
    }

    @Test
    @DisplayName("Test Multiplication")
    public void TestMultiplication() {
        int a = 5;
        int b = 2;
        int result = calculator.Multiply(a,b);
        assertEquals(10, result, "5 * 2 = 10");
    }

    @Test
    @DisplayName("Test Division")
    public void TestDivision() {
        int a = 10;
        int b = 5;
        int result = calculator.Divide(a,b);
        assertEquals(2, result, "10 / 5 = 2");

        a = 5;
        b = 2;
        result = calculator.Divide(a,b);
        assertEquals(2, result, "5 / 2 = 2.5");

        assertThrows(ArithmeticException.class, () -> calculator.Divide(10,0), "Should throw Arithmetic exception");
    }

    @Test
    @DisplayName("Test Square root")
    public void TestSquareRoot() {
        double result = calculator.SquareRoot(9);
        assertEquals(3, result, "Square Root of 9 = 3");

        result = calculator.SquareRoot(0);
        assertEquals(0, result, "Square Root of 0 = 0");
    }

    @Test
    @DisplayName("Test Circumference")
    public void TestCircumference() {
        double result = calculator.Circumference(3);
        assertEquals(18.85, result, 0.01,"Circumference of 3 = 18.85");

        result = calculator.Circumference(0);
        assertEquals(0, result, "Circumference of 0 = 0");
    }

    @Test
    @DisplayName("Test Area of circle")
    public void TestArea() {
        double result = calculator.AreaofCircle(3);
        assertEquals(28.27, result, 0.01,"Area of Circle of 3 = 28.27");

        result = calculator.AreaofCircle(0);
        assertEquals(0, result, "Area of Circle of 0 = 0");
    }
}