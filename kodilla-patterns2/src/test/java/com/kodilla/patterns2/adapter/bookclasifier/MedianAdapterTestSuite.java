package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;   
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //GIVEN
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author no. 1", "Title no. 1", 1970, "NO1"));
        books.add(new Book("Author no. 2", "Title no. 2", 1980, "NO2"));
        books.add(new Book("Author no. 3", "Title no. 3", 1990, "NO3"));
        books.add(new Book("Author no. 4", "Title no. 4", 2000, "NO4"));
        books.add(new Book("Author no. 5", "Title no. 5", 2010, "NO5"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //WHEN
        int median = medianAdapter.publicationYearMedian(books);

        //THEN
        System.out.println(median);
        assertEquals(median, 1990);
    }
}
