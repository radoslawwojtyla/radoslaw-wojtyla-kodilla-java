package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import javafx.scene.layout.Background;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String setName(String name) {
        return name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for(Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();

        for (Book book  : books) {
            Book clonedBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
    return clonedLibrary;
    }

}