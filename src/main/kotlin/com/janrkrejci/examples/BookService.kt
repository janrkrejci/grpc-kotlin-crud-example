package com.janrkrejci.examples

import com.example.janrkrejci.Books
import javax.inject.Singleton

@Singleton
class BookService {



    fun create(book: Books.BookInfo): Books.Book {
        return FakeBookDatabase.saveBookOnDb(book);
    }

    fun delete(id: Books.BookId) {

    }

    fun get(id: Books.BookId) {

    }

}
