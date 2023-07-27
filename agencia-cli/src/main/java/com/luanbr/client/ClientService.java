package com.luanbr.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8080/client")
public interface ClientService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response newClient(Client client);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findById")
    Client findById(@QueryParam("id") long id);


}
