package com.janrkrejci.examples

import com.example.janrkrejci.Books
import com.example.janrkrejci.Books.Book
import com.example.janrkrejci.Books.BookId

object FakeBookDatabase {

    fun saveBookOnDb(book: Books.BookInfo): Book {
        return Book.newBuilder()
                .setBookId(
                        BookId.newBuilder().setBookId(1)
                )
                .setBook(book)
                .build()
    }
}