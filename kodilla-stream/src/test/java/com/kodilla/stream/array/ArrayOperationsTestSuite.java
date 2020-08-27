package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    private int[] generateNumbersArray() {
        int numbers[] = new int[20];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i;

        }

        return numbers;
    }

    @Test
    void testGetAverage() {
        //Given
        int numbers[] = generateNumbersArray();
        OptionalDouble expectedAverage = OptionalDouble.of(9.5);

        //When
        OptionalDouble resultAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(expectedAverage, resultAverage);
    }
}
