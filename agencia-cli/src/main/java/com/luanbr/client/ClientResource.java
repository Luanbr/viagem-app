package com.luanbr.client;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("client-cli")
public class ClientResource {
    @Inject
    @RestClient
    ClientService clientService;

    @GET
    @Path("newClient")
    public Response newClient() {
        var client = Client.of(99, "Remote Client");
        var response = clientService.newClient(client);

        return Response.status(Response.Status.CREATED).entity(response).build();
    }

    @GET
    @Path("findById")
    public Client findById(long id) {
        return clientService.findById(id);
    }
}
