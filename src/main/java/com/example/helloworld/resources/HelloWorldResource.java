package com.example.helloworld.resources;

import com.example.helloworld.domain.Saying;
import com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldResource.class);

    @GET
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        return new Saying(name);
    }

    @POST
    public void receiveHello(@Valid Saying saying) {
        LOGGER.info("Received a saying: {}", saying);
    }

}
