package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("without sesame")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("onion")
                .ingredient("chilli")
                .ingredient("chesse")
                .ingredient("bacon")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(5, howManyIngredients);

    }
}
