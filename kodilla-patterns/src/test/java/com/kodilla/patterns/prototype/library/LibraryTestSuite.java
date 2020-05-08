package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2001, 1, 1));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2002, 2, 2));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2003, 3, 3));
        Book book4 = new Book("Title 4", "Author 4", LocalDate.of(2004, 4, 4));
        Book book5 = new Book("Title 5", "Author 5", LocalDate.of(2005, 5, 5));

        Library library = new Library("List of books no. 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //Shallow copy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("List of books no.2 (shallow copy)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep Copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("List of books no.3 (deep copy)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
