package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> booksLibA = new HashSet<>();
        Book book1 = new Book("Michal Kaczmarek", "test 1", 2016, "001/2016");
        Book book2 = new Book("Michal Kowalski", "test 2", 2017, "002/2017");
        Book book3 = new Book("Michal Nowak", "test 3", 2018, "003/2018");
        Book book4 = new Book("Michal Andrzejewski", "test 4", 2019, "004/2019");
        Book book5 = new Book("Michal Kowal", "test 5", 2020, "005/2020");
        booksLibA.add(book1);
        booksLibA.add(book2);
        booksLibA.add(book3);
        booksLibA.add(book4);

        //When
        int medianResult = medianAdapter.publicationYearMedian(booksLibA);

        //Then
        assertEquals(2018, medianResult);
    }
}
