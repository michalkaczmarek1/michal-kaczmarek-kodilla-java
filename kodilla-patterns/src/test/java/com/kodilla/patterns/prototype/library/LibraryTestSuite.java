package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");

        Book book1 = new Book("test1", "Jan Kowalski",
                LocalDate.of(2000, 10, 1));
        Book book2 = new Book("test2", "Andrzej Nowak",
                LocalDate.of(2001, 11, 2));
        Book book3 = new Book("test3", "Janina Kowalska",
                LocalDate.of(2002, 12, 3));
        Book book4 = new Book("test4", "Karol Nowak",
                LocalDate.of(2003, 1, 4));
        Book book5 = new Book("test5", "Michał Kaczmarek",
                LocalDate.of(2004, 2, 5));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        // making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library Poznan");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // making a deep clone of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library Wrocław");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(book5);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
