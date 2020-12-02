package com.example.janrkrejci

import com.example.janrkrejci.BookServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for examples.BookService.
 */
object BookServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = BookServiceGrpc.getServiceDescriptor()

  val searchMethod: MethodDescriptor<Books.BookSearchRequest, Books.Book>
    @JvmStatic
    get() = BookServiceGrpc.getSearchMethod()

  val getMethod: MethodDescriptor<Books.BookId, Books.Book>
    @JvmStatic
    get() = BookServiceGrpc.getGetMethod()

  val createMethod: MethodDescriptor<Books.BookInfo, Books.Book>
    @JvmStatic
    get() = BookServiceGrpc.getCreateMethod()

  val deleteMethod: MethodDescriptor<Books.BookId, Books.Empty>
    @JvmStatic
    get() = BookServiceGrpc.getDeleteMethod()

  /**
   * A stub for issuing RPCs to a(n) examples.BookService service as suspending coroutines.
   */
  @StubFor(BookServiceGrpc::class)
  class BookServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<BookServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BookServiceCoroutineStub =
        BookServiceCoroutineStub(channel, callOptions)

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
    fun search(request: Books.BookSearchRequest): Flow<Books.Book> = serverStreamingRpc(
      channel,
      BookServiceGrpc.getSearchMethod(),
      request,
      callOptions,
      Metadata()
    )
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
    suspend fun get(request: Books.BookId): Books.Book = unaryRpc(
      channel,
      BookServiceGrpc.getGetMethod(),
      request,
      callOptions,
      Metadata()
    )
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
    suspend fun create(request: Books.BookInfo): Books.Book = unaryRpc(
      channel,
      BookServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      Metadata()
    )
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
    suspend fun delete(request: Books.BookId): Books.Empty = unaryRpc(
      channel,
      BookServiceGrpc.getDeleteMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the examples.BookService service based on Kotlin coroutines.
   */
  abstract class BookServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
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
    open fun search(request: Books.BookSearchRequest): Flow<Books.Book> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method examples.BookService.Search is unimplemented"))

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
    open suspend fun get(request: Books.BookId): Books.Book = throw
        StatusException(UNIMPLEMENTED.withDescription("Method examples.BookService.Get is unimplemented"))

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
    open suspend fun create(request: Books.BookInfo): Books.Book = throw
        StatusException(UNIMPLEMENTED.withDescription("Method examples.BookService.Create is unimplemented"))

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
    open suspend fun delete(request: Books.BookId): Books.Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method examples.BookService.Delete is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = BookServiceGrpc.getSearchMethod(),
      implementation = ::search
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookServiceGrpc.getGetMethod(),
      implementation = ::get
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookServiceGrpc.getDeleteMethod(),
      implementation = ::delete
    )).build()
  }
}
