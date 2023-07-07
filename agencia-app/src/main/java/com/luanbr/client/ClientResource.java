package com.luanbr.client;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/client")
public class ClientResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> get() {
        return Client.listAll();
    }

    @GET
    @Path("findById")
    @Produces(MediaType.APPLICATION_JSON)
    public Client findById(@QueryParam("id") long id) {
        return Client.findById(id);
    }

    @DELETE
    @Path("deleteById")
    @Transactional
    public void deleteById(long id) {
        Client.deleteById(id);
    }



    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response newClient(Client client) {
        client.id = null;
        client.persist();

        return Response.status(Response.Status.CREATED).entity(client).build();
    }
}