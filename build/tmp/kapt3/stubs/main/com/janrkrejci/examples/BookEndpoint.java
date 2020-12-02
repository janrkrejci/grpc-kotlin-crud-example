package com.janrkrejci.examples;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/janrkrejci/examples/BookEndpoint;", "Lcom/example/janrkrejci/BookServiceGrpcKt$BookServiceCoroutineImplBase;", "bookService", "Lcom/janrkrejci/examples/BookService;", "(Lcom/janrkrejci/examples/BookService;)V", "getBookService", "()Lcom/janrkrejci/examples/BookService;", "create", "Lcom/example/janrkrejci/Books$Book;", "book", "Lcom/example/janrkrejci/Books$BookInfo;", "(Lcom/example/janrkrejci/Books$BookInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "grpc-micronaut-crud"})
@javax.inject.Singleton()
public final class BookEndpoint extends com.example.janrkrejci.BookServiceGrpcKt.BookServiceCoroutineImplBase {
    @org.jetbrains.annotations.NotNull()
    private final com.janrkrejci.examples.BookService bookService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object create(@org.jetbrains.annotations.NotNull()
    com.example.janrkrejci.Books.BookInfo book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Book> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.janrkrejci.examples.BookService getBookService() {
        return null;
    }
    
    public BookEndpoint(@org.jetbrains.annotations.NotNull()
    com.janrkrejci.examples.BookService bookService) {
        super(null);
    }
}