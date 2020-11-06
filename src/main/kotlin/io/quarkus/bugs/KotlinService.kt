package io.quarkus.bugs

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class KotlinService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}