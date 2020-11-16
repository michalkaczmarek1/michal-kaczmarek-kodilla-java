package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifer {
    int publicationYearMedian(Set<Book> bookSet);
}
