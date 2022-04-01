package com.solid.BOOK;
import com.solid.BOOK.Book;

public class Readable extends Book{

    public Readable(){
        super();
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}