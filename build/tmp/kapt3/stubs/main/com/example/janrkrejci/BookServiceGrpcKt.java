package com.example.janrkrejci;

import java.lang.System;

/**
 * Holder for Kotlin coroutine-based client and server APIs for examples.BookService.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00048G\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00138FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2 = {"Lcom/example/janrkrejci/BookServiceGrpcKt;", "", "()V", "createMethod", "Lio/grpc/MethodDescriptor;", "Lcom/example/janrkrejci/Books$BookInfo;", "Lcom/example/janrkrejci/Books$Book;", "getCreateMethod", "()Lio/grpc/MethodDescriptor;", "deleteMethod", "Lcom/example/janrkrejci/Books$BookId;", "Lcom/example/janrkrejci/Books$Empty;", "getDeleteMethod", "getMethod", "getGetMethod", "searchMethod", "Lcom/example/janrkrejci/Books$BookSearchRequest;", "getSearchMethod", "serviceDescriptor", "Lio/grpc/ServiceDescriptor;", "getServiceDescriptor$annotations", "getServiceDescriptor", "()Lio/grpc/ServiceDescriptor;", "BookServiceCoroutineImplBase", "BookServiceCoroutineStub", "grpc-micronaut-crud"})
public final class BookServiceGrpcKt {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.janrkrejci.BookServiceGrpcKt INSTANCE = null;
    
    @java.lang.Deprecated()
    public static void getServiceDescriptor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.ServiceDescriptor getServiceDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.MethodDescriptor<com.example.janrkrejci.Books.BookSearchRequest, com.example.janrkrejci.Books.Book> getSearchMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.MethodDescriptor<com.example.janrkrejci.Books.BookId, com.example.janrkrejci.Books.Book> getGetMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.MethodDescriptor<com.example.janrkrejci.Books.BookInfo, com.example.janrkrejci.Books.Book> getCreateMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.MethodDescriptor<com.example.janrkrejci.Books.BookId, com.example.janrkrejci.Books.Empty> getDeleteMethod() {
        return null;
    }
    
    private BookServiceGrpcKt() {
        super();
    }
    
    /**
     * A stub for issuing RPCs to a(n) examples.BookService service as suspending coroutines.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\n\u001a\u00020\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/janrkrejci/BookServiceGrpcKt$BookServiceCoroutineStub;", "Lio/grpc/kotlin/AbstractCoroutineStub;", "channel", "Lio/grpc/Channel;", "callOptions", "Lio/grpc/CallOptions;", "(Lio/grpc/Channel;Lio/grpc/CallOptions;)V", "build", "create", "Lcom/example/janrkrejci/Books$Book;", "request", "Lcom/example/janrkrejci/Books$BookInfo;", "(Lcom/example/janrkrejci/Books$BookInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "Lcom/example/janrkrejci/Books$Empty;", "Lcom/example/janrkrejci/Books$BookId;", "(Lcom/example/janrkrejci/Books$BookId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "search", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/janrkrejci/Books$BookSearchRequest;", "grpc-micronaut-crud"})
    @io.grpc.kotlin.StubFor(value = com.example.janrkrejci.BookServiceGrpc.class)
    public static final class BookServiceCoroutineStub extends io.grpc.kotlin.AbstractCoroutineStub<com.example.janrkrejci.BookServiceGrpcKt.BookServiceCoroutineStub> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.example.janrkrejci.BookServiceGrpcKt.BookServiceCoroutineStub build(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel, @org.jetbrains.annotations.NotNull()
        io.grpc.CallOptions callOptions) {
            return null;
        }
        
        /**
         * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
         * server as they arrive.  That flow finishes normally if the server closes its response with
         * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
         * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
         * is cancelled with that exception as a cause.
         *
         * @param request The request message to send to the server.
         *
         * @return A flow that, when collected, emits the responses from the server.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.Flow<com.example.janrkrejci.Books.Book> search(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookSearchRequest request) {
            return null;
        }
        
        /**
         * Executes this RPC and returns the response message, suspending until the RPC completes
         * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
         * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
         * with the corresponding exception as a cause.
         *
         * @param request The request message to send to the server.
         *
         * @return The single response from the server.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookId request, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Book> p1) {
            return null;
        }
        
        /**
         * Executes this RPC and returns the response message, suspending until the RPC completes
         * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
         * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
         * with the corresponding exception as a cause.
         *
         * @param request The request message to send to the server.
         *
         * @return The single response from the server.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object create(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookInfo request, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Book> p1) {
            return null;
        }
        
        /**
         * Executes this RPC and returns the response message, suspending until the RPC completes
         * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
         * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
         * with the corresponding exception as a cause.
         *
         * @param request The request message to send to the server.
         *
         * @return The single response from the server.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookId request, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Empty> p1) {
            return null;
        }
        
        public BookServiceCoroutineStub(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel, @org.jetbrains.annotations.NotNull()
        io.grpc.CallOptions callOptions) {
            super(null, null);
        }
        
        public BookServiceCoroutineStub(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel) {
            super(null, null);
        }
    }
    
    /**
     * Skeletal implementation of the examples.BookService service based on Kotlin coroutines.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\t\u001a\u00020\u0013H\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/janrkrejci/BookServiceGrpcKt$BookServiceCoroutineImplBase;", "Lio/grpc/kotlin/AbstractCoroutineServerImpl;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "bindService", "Lio/grpc/ServerServiceDefinition;", "create", "Lcom/example/janrkrejci/Books$Book;", "request", "Lcom/example/janrkrejci/Books$BookInfo;", "(Lcom/example/janrkrejci/Books$BookInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "Lcom/example/janrkrejci/Books$Empty;", "Lcom/example/janrkrejci/Books$BookId;", "(Lcom/example/janrkrejci/Books$BookId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "search", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/janrkrejci/Books$BookSearchRequest;", "grpc-micronaut-crud"})
    public static abstract class BookServiceCoroutineImplBase extends io.grpc.kotlin.AbstractCoroutineServerImpl {
        
        /**
         * Returns a [Flow] of responses to an RPC for examples.BookService.Search.
         *
         * If creating or collecting the returned flow fails with a [StatusException], the RPC
         * will fail with the corresponding [Status].  If it fails with a
         * [java.util.concurrent.CancellationException], the RPC will fail with status
         * `Status.CANCELLED`.  If creating
         * or collecting the returned flow fails for any other reason, the RPC will fail with
         * `Status.UNKNOWN` with the exception as a cause.
         *
         * @param request The request from the client.
         */
        @org.jetbrains.annotations.NotNull()
        public kotlinx.coroutines.flow.Flow<com.example.janrkrejci.Books.Book> search(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookSearchRequest request) {
            return null;
        }
        
        /**
         * Returns the response to an RPC for examples.BookService.Get.
         *
         * If this method fails with a [StatusException], the RPC will fail with the corresponding
         * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
         * will fail
         * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
         * fail with `Status.UNKNOWN` with the exception as a cause.
         *
         * @param request The request from the client.
         */
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object get(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookId p0, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Book> p1) {
            return null;
        }
        
        /**
         * Returns the response to an RPC for examples.BookService.Create.
         *
         * If this method fails with a [StatusException], the RPC will fail with the corresponding
         * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
         * will fail
         * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
         * fail with `Status.UNKNOWN` with the exception as a cause.
         *
         * @param request The request from the client.
         */
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object create(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookInfo p0, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Book> p1) {
            return null;
        }
        
        /**
         * Returns the response to an RPC for examples.BookService.Delete.
         *
         * If this method fails with a [StatusException], the RPC will fail with the corresponding
         * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
         * will fail
         * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
         * fail with `Status.UNKNOWN` with the exception as a cause.
         *
         * @param request The request from the client.
         */
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object delete(@org.jetbrains.annotations.NotNull()
        com.example.janrkrejci.Books.BookId p0, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.janrkrejci.Books.Empty> p1) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.grpc.ServerServiceDefinition bindService() {
            return null;
        }
        
        public BookServiceCoroutineImplBase(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext coroutineContext) {
            super(null);
        }
        
        public BookServiceCoroutineImplBase() {
            super(null);
        }
    }
}