package com.luanbr.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/client")
public class ClientResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> get() {
        return Client.listAll();
    }
}