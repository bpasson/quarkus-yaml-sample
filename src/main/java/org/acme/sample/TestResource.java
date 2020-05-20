package org.acme.sample;

import io.smallrye.mutiny.Uni;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/foo")
public class TestResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON, "application/yaml"})
    public Uni<Response> test(Sample sample) {
        sample.setValue(sample.getValue() + " foo");
        return Uni.createFrom().item(Response.ok(sample).build());
    }
}