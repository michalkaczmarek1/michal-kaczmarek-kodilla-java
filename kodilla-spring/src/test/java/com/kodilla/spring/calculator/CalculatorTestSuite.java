package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(2.4, 3.4);
        double resultSub = calculator.sub(1.3, 5.6);
        double resultMul = calculator.mul(7.5, 2.4);
        double resultDiv = calculator.div(2.2, 1.1);

        //Then
        assertEquals(5.8, resultAdd);
        assertEquals(-4.3, resultSub);
        assertEquals(18.0, resultMul);
        assertEquals(2.0, resultDiv);
    }
}
