package org.example.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void modulo() {
        int result = calculator.modulo(100, 20);
        assertEquals(0, result);
        assertNotEquals(3641, result);
    }

    @Test
    void division() {
        double result = calculator.division(100, 20);
        assertEquals(5, result);
        assertNotEquals(1000, result);
    }

    @Test
    void multiplication() {
        int result = calculator.multiplication(100, 20);
        assertEquals(2000, result);
        assertNotEquals(3972, result);
    }

    @Test
    void subtraction() {
        int result = calculator.subtraction(100, 20);
        assertEquals(80, result);
        assertNotEquals(123, result);
    }

    @Test
    void addition() {
        int result = calculator.addition(100, 20);
        assertEquals(120, result);
        assertNotEquals(014, result);
    }
}