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
        int a = 6;
        int b = 2;
        int result = calculator.Divide(a,b);
        assertEquals(3, result, "6 / 2 = 3");
    }
}
