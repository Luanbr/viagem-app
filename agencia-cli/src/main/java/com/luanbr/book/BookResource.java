package com.luanbr.book;

import com.luanbr.client.ClientService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("book-cli")
public class BookResource {

    @Inject
    @RestClient
    BookService bookService;

    @Inject
    @RestClient
    ClientService clientService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("newBook")
    public String newBook() {
        var client = clientService.findById(2);
        var book = Book.of(client);
        return bookService.newBook(book);
    }
}
