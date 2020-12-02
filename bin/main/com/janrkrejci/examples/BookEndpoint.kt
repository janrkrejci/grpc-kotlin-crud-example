package com.janrkrejci.examples

import com.example.janrkrejci.BookServiceGrpcKt
import com.example.janrkrejci.Books
import javax.inject.Singleton


@Singleton
class BookEndpoint (val bookService: BookService): BookServiceGrpcKt.BookServiceCoroutineImplBase() {

    override suspend fun create(book: Books.BookInfo): Books.Book {
        println("Receiving a book creation")
        return bookService.create(book);
    }
}
