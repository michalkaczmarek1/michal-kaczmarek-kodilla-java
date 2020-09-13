package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.add(2.4, 3.3);
        calculator.sub(1.3, 5.6);
        calculator.mul(7.5, 2.4);
        calculator.div(2.2, 1.1);

        //Then
        //do nothing
    }
}
