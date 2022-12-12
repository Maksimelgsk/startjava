package com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String name;
    private final int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return author + " " + name + " " + year;
    }
}
