package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int BOOKSHELF_LIMIT = 10;
    private int count;
    private final Book[] books = new Book[BOOKSHELF_LIMIT];
    private int maxLength;

    public void add(Book book) {
        books[count] = book;
        calculateMaxLength(book);
        count++;

    }

    public void delete(String name) {
        int index = findIndex(name);
        if (index < 0) {
            throw new IllegalStateException("Книга не найдена");
        }
        int length = books[index].toString().length();
        count--;
        System.arraycopy(books, index + 1, books, index, count - index);
        if (length == maxLength) {
            calculateMaxLength();
        }
    }

    public Book find(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public int getCountEmptyShelfs() {
        return BOOKSHELF_LIMIT - count;
    }

    public int getMaxLength() {
        return maxLength;
    }


    public void clear() {
        Arrays.fill(books, 0, count, null);
        count = 0;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, count);
    }

    public boolean isFull() {
        return (count >= BOOKSHELF_LIMIT);
    }

    private void calculateMaxLength() {
        maxLength = 0;
        for (int i = 0; i < count; i++) {
            calculateMaxLength(books[i]);
        }
    }

    private void calculateMaxLength(Book book) {
        int length = book.toString().length();
        if (length > maxLength) {
            maxLength = length;
        }
    }

    private int findIndex(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
