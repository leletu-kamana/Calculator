/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lelethu Kamana
 */

public class CalculatorTest {  

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10, calc.calculate(5, 5, '+'));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calc.calculate(5, 3, '-'));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calc.calculate(5, 3, '*'));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.calculate(6, 3, '/'));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(0, calc.calculate(5, 0, '/'));
    }

    @Test
    public void testInvalidOperator() {
        assertEquals(0, calc.calculate(5, 5, '%'));
    }
}