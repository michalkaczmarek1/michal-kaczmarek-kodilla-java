package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }

    @DisplayName("when call method exterminate with empty list as argument, " +
            "then exterminate should return also empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Execute testOddNumbersExterminatorEmptyList");
        //Then
        Assertions.assertEquals(emptyList, evenNumbers);
    }

    @DisplayName("when call method exterminate with normal list numbers(even and odd) as argument, " +
            "then exterminate should return list with even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbersTest = new ArrayList<>();
        for (Integer number: numbers){
            if(number % 2 == 0){
                evenNumbersTest.add(number);
            }
        }
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Execute testOddNumbersExterminatorNormalList");
        //Then
        Assertions.assertEquals(evenNumbersTest, evenNumbers);
    }
}
